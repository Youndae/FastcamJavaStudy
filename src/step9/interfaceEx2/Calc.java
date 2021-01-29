package step9.interfaceEx2;

public interface Calc {

    double PI = 3.14;
    int ERROR = -99999999;

    int add(int num1, int num2);
    int sub(int num1, int num2);
    int mul(int num1, int num2);
    int div(int num1, int num2);

    default void description(){
        System.out.println("정수 계산기를 구현합니다.");
        //myMethod();
        //이렇게 쓰고
        //Complete에서 재정의 한것을 지운뒤에
        //실행하면 private method가 출력되는것을 확인할 수 있다.


    }

    static int total(int[] arr){
        int total = 0;

        for(int i : arr){
            total += i;
        }
        //myStaticMethod();
        //static메소드에서 일반 메소드를 호출 할 수 없다.
        //이것도 역시 private static method가 출력되는것을
        //확인할 수 있다.
        return total;
    }

    /*private void myMethod(){ //자바 9부터 제공되기 때문에 1.8인 현재는 안된다.
        System.out.println("private method");
    }*/

    /*private static void myStaticMethod(){
        System.out.println("private static method");
    }*/
}
