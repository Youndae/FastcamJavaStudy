package study01;

public class OperatorEx1 {
    public static void main(String[] args) {

        int num1 = -10;
        int num2 = 20;

        System.out.println(+num1);
        System.out.println(+num2);

        System.out.println(-num1);
        System.out.println(-num2);

        System.out.println(num1);
        System.out.println(num2);
        //출력할때 변환을 했다고 해서 값이 아예 변경되는것은 아니다.

        num1 = -num1;
        //값을 변경하려면 이렇게 대입연산자를 사용해야 한다.
        System.out.println(num1);
    }
}
