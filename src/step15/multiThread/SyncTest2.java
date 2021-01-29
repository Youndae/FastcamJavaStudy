package step15.multiThread;

/**
 * synchronized 메서드 방식
 */
class Bank2{
    private int money = 10000;
    //이렇게 saveMoney와 minusMoney 에 synchronized 를 붙여주면
    //두 메서드가 속해있는 Bank2에 lock이 걸린다.
    //하나를 수행하게 되면 다른 스레드가 접근을 할 수 없다.
    //park2가 수행되는 중이라면 parkwife2 는 접근할 수 없는 것이다.

    public synchronized void saveMoney(int save){

        int m = this.getMoney();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setMoney(m + save);
    }

    public synchronized void minusMoney(int minus){
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

class Park2 extends Thread {
    public void run(){
        System.out.println("start save");
        SyncTest2.myBank.saveMoney(3000);
        System.out.println("save money" + SyncTest2.myBank.getMoney());
    }
}

class ParkWife2 extends Thread {
    public void run(){
        System.out.println("start minus");
        SyncTest2.myBank.minusMoney(1000);
        System.out.println("minus money" + SyncTest2.myBank.getMoney());
    }
}


public class SyncTest2 {

    public static Bank2 myBank = new Bank2();

    public static void main(String[] args) throws InterruptedException {
        Park2 p = new Park2();
        p.start();

        Thread.sleep(200);

        ParkWife2 pw = new ParkWife2();
        pw.start();
        /*
            이렇게 synchronized 를 사용하면
            start save
            start minus
            save money13000
            minus money 12000
            이 출력된다.

            start save를 시작하고
            start minus로 minusmoney가 실행되었지만
            synchronized에 의해 접근할 수 없어서 대기하게 되고
            save money13000으로 모든 처리가 끝난 뒤에
            minus money12000 으로 마저 수행되는 것이다.


         */
    }
}
