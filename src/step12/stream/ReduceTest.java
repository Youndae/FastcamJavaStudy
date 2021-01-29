package step12.stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

    @Override
    public String apply(String s1, String s2) {
        if(s1.getBytes().length >= s2.getBytes().length)
            return s1;
        else
            return s2;

    }
}

public class ReduceTest {

    public static void main(String[] args) {
        String[] greetings = {"안녕하세요~~~", "hello", "Good Morning", "반갑습니다"};

        //가장 긴 문자열을 출력
        /*System.out.println(Arrays.stream(greetings).reduce("", (s1, s2)->
        {
            if(s1.getBytes().length >= s2.getBytes().length)
                return s1;
            else
                return s2;

        }));*/

        //위 코드가 너무 길다면 Binary Operator를 받은 CompareString을 구현해서
        //아래와 같이 처리하면 된다.
        //결국 같은 처리를 여러번 해야한다면 코드 재사용으로 클래스 새로 만들어서
        //편하게 쓰라는것.
        System.out.println(Arrays.stream(greetings).reduce(new CompareString()).get());
    }
}
