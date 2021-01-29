package step15.multiThread;

class Bank{
    private int money = 10000;

    public void saveMoney(int save){
        int m = this.getMoney();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setMoney(m + save);
    }

    public void minusMoney(int minus){
        int m = this.getMoney();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setMoney(m - minus);
    }

    public int getMoney(){
        return money;
    }

    public void setMoney(int money){
        this.money = money;
    }
}

class Park extends Thread {
    public void run(){
        System.out.println("start save");
        SyncTest.myBank.saveMoney(3000);
        System.out.println("save money" + SyncTest.myBank.getMoney());
    }
}

class ParkWife extends Thread {
    public void run(){
        System.out.println("start minus");
        SyncTest.myBank.minusMoney(1000);
        System.out.println("minus money" + SyncTest.myBank.getMoney());
    }
}


public class SyncTest {

    public static Bank myBank = new Bank();

    public static void main(String[] args) throws InterruptedException {
        Park p = new Park();
        p.start();

        Thread.sleep(200);

        ParkWife pw = new ParkWife();
        pw.start();
        /*
            여기까지 했을 때
            start save
            start minus
            minus money9000
            save money 13000
            이 되었다.

            생각하기로는 10000원에서 park을 먼저 불렀으니
            3000원을 더해서 13000원이 출력되고
            그다음 parkwife가 1000원을 썼으니
            13000원에서 12000원이 빠져야 된다.

            결과 나온 순서를 보면
            save가 시작하고 결과가 나오기 전에
            minus가 시작되었다.
            그리고 minus의 결과가 나온 뒤에
            save의 결과가 나왔는데

            코드를 보면 save는 3초를 대기하고
            minus는 0.2초를 대기한다.

            그럼 park을 호출함으로써 save가 불려왔고
            save에서는 기본값인 10000원을 가져왔다.
            그리고 처리하기 전에 3초를 쉰다.
            근데 그 사이에 parkwife가 돈을 출금한것이다.
            minus는 0.2초의 대기시간을 갖기 때문에
            save의 대기시간인 3초가 채 지나기 전에 전부 처리된것이다.
            그래서 minus가 먼저 처리되어서 9000원이 된것인데

            save가 왜 13000원이 된거냐면
            save는 위에서 얘기했다시피 기본값 10000원을 m으로 가진채로
            대기상태로 들어갔기 때문에 m + save를 하게 되면
            당연히 13000이 될 수 밖에 없다.

            대기하다 빠져나와서 새로 Money를 가져온것이 아니므로
            당연히 기본값에 +를 해주는것.
            동기화가 안된것이다.

         */
    }
}
