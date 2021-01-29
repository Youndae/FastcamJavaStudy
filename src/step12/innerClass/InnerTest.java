package step12.innerClass;


class OutClass{

    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass(){
        //innerClass는 주로 OutClass에서 많이 생성하는데
        //OutClass의 constructor에서 많이 생성한다.

        inClass = new InClass();
    }

    class InClass{
        //이게 innerclass
        //메서드 안에 있는것도 아니고
        //static이 붙은것도 아니기 때문에
        //instance inner class다.
        int iNum = 100;
        /*static int sInNum = 200;
        * 이러면 에러가 발생한다.
        * innerClass는 생성이후에 쓸수 있는데
        * static은 생성과 관계없이 쓸 수 있기 때문에 오류가 발생한다.
        * class도 static을 붙여주면 문제가 되지 않는다.
        * 하지만 지금은 instance inner class이고
        * outclass이후에 생성되야 하기 때문에 사용할 수 없다.
        * */

        void inTest(){
            System.out.println(num);
            System.out.println(sNum);
        }

    }

    public void usingInner(){
        inClass.inTest();
    }

    static class InStaticClass{
        /*
            Static InnerClass는 outclass의 생성여부와 상관없이 쓴다.
         */

        int inNum = 100;
        static int sInNum = 200;

        void inTest(){
            System.out.println(inNum);
            System.out.println(sInNum);
            System.out.println(sNum);
        }

        static void sTest(){
            //static클래스이기 떄문에 static변수나 static메서드를 만들 수 있다.
            //System.out.println(inNum);
            //inNum의 경우는 static메서드들 보다 나중에 생성되기 때문에
            //사용할 수 없다.
            //static만 사용할 수 있는것.
            System.out.println(sInNum);
            System.out.println(sNum);
        }
    }
}

public class InnerTest {

    public static void main(String[] args) {
        OutClass outClass = new OutClass();

        outClass.usingInner();
        //InClass를 private 변수로 만들었기 때문에
        //부를 수 없다. 그래서 usingInner를 만들어서 호출한다.

        OutClass.InClass myInClass = outClass.new InClass();
        //많이 사용하는 문법은 아니다.
        //outClass에서만 쓸려고 innerClass를 만든것이기 때문에
        //이렇게 쓸거면 innerclass로 만들 필요가 없기 때문이다.
        //문법적으로는 이렇게 사용할 수 있다는것이다.
        //만약 InClass를 private으로 만들어 준다면 이렇게 쓸 수 없다.

        System.out.println();

        //OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        //sInclass.inTest();
        //static클래스는 이렇게 생성할 수 있다.
        //inTest는 static메서드가 아니기때문에 이렇게 호출해줘야 한다.

        OutClass.InStaticClass.sTest();
        //static메서드는 위의 코드와 아무 상관없이 이렇게 쓸 수 있다.



    }
}
