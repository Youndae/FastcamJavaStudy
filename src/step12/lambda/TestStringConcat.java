package step12.lambda;


public class TestStringConcat {

    public static void main(String[] args) {
        StringConImpl impl = new StringConImpl();
        impl.makeString("hello", "world");
        //이게 원래 사용하던 인터페이스 방식

        StringConcat concat = (s, v)-> System.out.println(s+", "+v);
        concat.makeString("Hello", "World");
        /*
            이렇게 한다면 StringConImpl 클래스가 필요가 없다.
            여기서 람다로 구현한 상태이므로 그냥 인터페이스 하나만 있어도 사용할 수 있는것.

         */

        StringConcat concat2 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1+", "+s2);
            }
        };
        //여기서 anonymous innerclass로 구현할 수 있다.
        //람다식으로 구현을 하지만 나중에 내부에 익명객체가 생성이 된다.
        //이 익명객체가 자동으로 생성되면서 처리되는것이다.

        concat2.makeString("hello, ","world,");
    }
}
