package step15.thread;

public class JoinTest extends Thread{

    int start;
    int end;
    int total;

    public JoinTest(int start, int end){
        this.start = start;
        this.end = end;
    }

    public void run(){
        int i;
        for(i = start; i <= end; i++){
            total += i;
        }
    }

    public static void main(String[] args) {

        /*JoinTest jt1 = new JoinTest(1, 50);
        JoinTest jt2 = new JoinTest(51, 100);

        jt1.start();
        jt2.start();

        int total = jt1.total + jt2.total;

        System.out.println("jt1.total = " + jt1.total);
        System.out.println("jt2.total = " + jt2.total);

        System.out.println("total = "+total);*/

        //이렇게 실행하면 0이 나온다.
        //jt1은 0 jt2는 3775가 나오는데
        //jt1은 계산이 되었지만 jt2는 계산이 안된상태로 total이 수행되서
        //이렇게 jt1과 같은 값이 total로 출력되는 것이다.
        //어쩌다가 제대로 연산이 되어서 출력될 수 있지만 안나올 가능성이 높다.
        //이럴때는 아래와 같이 수행한다.


        JoinTest jt1 = new JoinTest(1, 50);
        JoinTest jt2 = new JoinTest(51, 100);

        jt1.start();
        jt2.start();

        try {
            jt1.join();
            jt2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*
            이렇게 하면 total이 join이 끝나야 수행되기 때문에
            연산이 전부 진행된 다음 total의 연산이 수행된다.
            ThreadTest에서 결과값을 보면
            start와 end가 출력된 다음
            값들이 출력되었는데
            그것과 마찬가지인것 같다
            main에 대한 수행이 먼저 이루어지고 그다음 처리가 되서
            연산이 안되는건데
            join은 그것을 대기시키는 역할인듯.

         */

        int total = jt1.total + jt2.total;

        System.out.println("jt1.total = " + jt1.total);
        System.out.println("jt2.total = " + jt2.total);

        System.out.println("total = "+total);


    }
}
