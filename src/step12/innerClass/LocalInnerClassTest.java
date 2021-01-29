package step12.innerClass;

class Outer{

    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i){

        int num = 100;
        class MyRunnable implements Runnable{

            @Override
            public void run(){
                //메서드안에 클래스를 만들었기 때문에
                //지역 내부클래스이다.

                /*num[0] += 10;
                i = 200;*/

                System.out.println(num);
                System.out.println(i);

                /*
                    i와 num은 메서드 안에 있는 지역변수다.
                    이 메서드가 호출되서 끝날때까지 유효한게 지역변수이지만
                    MyRunnable이 반환되고 나면 이 메서드가 끝난 다음에도
                    Run은 언제든 불릴 수 있다.
                    그럼 Run이 불렸을때는 지역변수이기 때문에
                    변수가 유효하지 않다.
                    그래서 지역 내부클래스가 쓰이는 메서드에서 변수들은
                    상수가 된다.
                 */

                System.out.println(outNum);
                System.out.println(Outer.sNum);
            }
        }

        return new MyRunnable();
    }
}

public class LocalInnerClassTest {

    public static void main(String[] args) {
        Outer outer = new Outer();
        Runnable runnable = outer.getRunnable(50);

        runnable.run();
    }
}
