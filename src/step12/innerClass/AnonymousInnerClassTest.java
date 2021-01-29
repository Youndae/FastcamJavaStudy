package step12.innerClass;

class Outter{

    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i){

        int num = 100;
        return new Runnable(){

            @Override
            public void run(){

                System.out.println(num);
                System.out.println(i);
                System.out.println(outNum);
                System.out.println(Outer.sNum);
            }
        };
        //이게 익명이너클래스다. 이름이 없는 이너클래스.
    }

    Runnable runner = new Runnable() {
        @Override
        public void run() {
            System.out.println("test");
        }
    };//이렇게도 작성할 수 있다.
    //익명이너클래스는 바로 인터페이스나 추상클래스에 대한 생성을 바로 할 수 있다.
    //원래는 상속받은 클래스를 만들고 클래스를 생성해서 썻는데
    //단 하나의 인터페이스나 단 하나의 추상클래스인경우는
    //클래스 이름없이 new 키워드를 이용해 생성할 수 있다.

}

public class AnonymousInnerClassTest {

    public static void main(String[] args) {
        Outter outer = new Outter();
        outer.runner.run();

        Runnable runnable = outer.getRunnable(50);

        runnable.run();
    }
}
