package step12.lambda;

interface PrintString{
    void show(String str);
}


public class TestLambda {

    public static void main(String[] args) {

        PrintString lambdastr = s-> System.out.println(s);
        lambdastr.show("hi");
        /*
            lambdastr.show라는 것은
            lambdastr에서 구현되어있는 출력문에 s를 넣어서 넘겨주는것이고
            결국에는 PringString.show에 lambdastr이라는 함수가 생겨나면서
            그 매개변수로 "hi"가 넘어가고
            그럼 출력문이 구현되어있으니까 출력되는것.
         */

        showMyString(lambdastr);
        /*
            showMyString에서는 printString 으로 받는다.
            그럼 printString타입인 lambdastr을 매개변수로 넘겨주고
            그 매개변수가 p가 되니
            showMyString 안에 있는 p.show는
            lambdastr.show가 되는것이나 마찬가지다.
         */

        PrintString test = returnString();
        test.show("test");
        /*
            함수의 구현부가 마치 변수처럼 returnString으로 반환이 되서
            대입이 되고 그 메서드가 호출될 수 있다.
         */
    }

    public static void showMyString(PrintString p){
        p.show("Hello");
    }

    public static PrintString returnString(){
        return s-> System.out.println(s + "!!!");
    }
}
