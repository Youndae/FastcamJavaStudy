package step15.thread;



class MyThread extends Thread{
    public void run(){
        //아무것도 구현하라고 하지 않지만
        //스레드가 스타트 되면 스레드는 run메소드가 수행된다.
        //그래서 run을 구현해야 한다.

        int i;

        for(i = 0; i <= 200; i++){
            System.out.print(i + "\t");

            try {
                sleep(100);
                //sleep은 InterruptedException이 발생해서 깨어날 수 있는
                //가능성이 있기 때문에 잡아줘야 한다.
                //100이라는 것은 0.1초씩 잠들었다 깨어나면서 수행하도록 한다.
                //sleep은 스레드 메서드의 static클래스다.
                //쓸 수 있다는 것은 이 클래스가 스레드 클래스를 상속받았기 때문이다.

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread2 implements Runnable{
    //이렇게도 사용이 가능하다.
    //마찬가지로 run을 구현하라고 나온다.

    /*
        단 여기서는 sleep을 바로 쓸수는 없고
        Thread.sleep();
        이렇게 써야한다.
        아니면 import해줄 수도 있다.
        import static java.lang.Thread.sleep;
     */
    @Override
    public void run() {

        int i;

        for(i = 0; i <= 200; i++) {
            System.out.print(i + "\t");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadTest {

    public static void main(String[] args) {

        System.out.println("start");
        /*MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();

        th1.start();
        th2.start();*/

        MyThread2 runner1 = new MyThread2();
        Thread th1 = new Thread(runner1);
        th1.start();

        MyThread2 runner2 = new MyThread2();
        Thread th2 = new Thread(runner2);
        th2.start();
        /*
            Runnable을 implements해서 사용한다면
            이렇게 스레드 객체를 만들고 스레드 인스턴스에
            runnable객체를 넣어서 돌려야 한다.
            결과는 같다.
         */

        Thread t = Thread.currentThread();
        System.out.println(t);

        System.out.println("end");

        /*
            start와 end가 먼저 출력된다.
            main안에서 돌아가는 스레드는 총 세개다
            메인스레드
            메인안에서 스레드 두개 생성.
            그래서 제일 먼저 종료되는 것은 메인스레드이다.
            메인스레드가 하는일은
            스타트 찍고
            스레드 두개 만들고 end찍고 끝난다.
            그리고나서 th1, th2 가 수행된다.
            순서대로 될 수도 있지만 중간중간 순서가 섞이는 것도 확인할 수 있다.

         */
    }
}
