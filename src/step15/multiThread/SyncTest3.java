package step15.multiThread;

/**
 * synchronized 수행문(block) 방식
 */
class Bank3{
    private int money = 10000;


    public void saveMoney(int save){

        synchronized (this) {

            int m = this.getMoney();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            setMoney(m + save);
        }
    }
    /*
       block 방식은 위와 같이 한다.
       메서드 구현부에 작성해주면 된다.
       이 코드들을 예로 saveMoney에는 이렇게 block 방식으로 작성하고
       minusMoney에는 메서드 방식으로 작성해도 된다.

       만약에 saveMoney에는 작성했지만 minusMoney에는 작성하지 않았다면
       제대로 동기화 되지 않는다.

       this위치에 lock을 걸고자 하는 객체를 써주면 되는데
       지금 여기서는 Bank에 lock을 걸어야 하므로
       this로 작성한것.
     */

    public void minusMoney(int minus){

        synchronized (this) {

            int m = this.getMoney();

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            setMoney(m - minus);
        }
    }

    public int getMoney(){
        return money;
    }

    public void setMoney(int money){
        this.money = money;
    }
}

class Park3 extends Thread {
    public void run(){
        System.out.println("start save");
        SyncTest3.myBank.saveMoney(3000);
        System.out.println("save money" + SyncTest3.myBank.getMoney());
    }

    /*
        public synchronized void run(){
        }
        이렇게 run에다가 걸어봤자 소용이 없다.
        왜냐면 이것은 리소스에 락을 거는 것이기 때문이다.
        만약 run에서 락을 걸고 싶다면

        public void run(){
          synchronized (SyncTest3.myBank) {
            구현부
          }
        }
        이렇게 하면 된다.

        이렇게 구현했을때의 차이점은
        start save
        save money13000
        start minus
        minus money12000
        이렇게 결과값이 바뀐다.
        즉, save가 다 수행된 다음에야 minus가 시작된다는 것이다.


     */
}

class ParkWife3 extends Thread {
    public void run(){
        System.out.println("start minus");
        SyncTest3.myBank.minusMoney(1000);
        System.out.println("minus money" + SyncTest3.myBank.getMoney());
    }
}


public class SyncTest3 {

    public static Bank3 myBank = new Bank3();

    public static void main(String[] args) throws InterruptedException {
        Park3 p = new Park3();
        p.start();

        Thread.sleep(200);

        ParkWife3 pw = new ParkWife3();
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
