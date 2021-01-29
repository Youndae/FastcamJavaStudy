package step12.lambda;

public class TestMyMaxNumber {

    public static void main(String[] args) {

        MyMaxNumber max = (x, y)->(x >= y) ? x : y;
        /*
            x, y 두개의 매개변수가 넘어올건데 인터페이스의 메서드가 호출되면
            익명이고 max라는 이름으로 구현된 것은 두개의 변수가 넘어왔을 때
            더 큰 값을 반환하라는것.
            삼항연산자니까 x가 더 크거나 같으면 x 아니라면 y
            return 되는건데 return이 붙으면 중괄호를 넣어줘야 하기 때문에
            그냥 사용한것.
            MyMaxNumber max = (x, y)->{return (x >= y) ? x : y;};

         */

        System.out.println(max.getMaxNumber(10, 20));
    }
}
