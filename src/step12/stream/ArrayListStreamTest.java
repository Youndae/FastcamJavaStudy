package step12.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

    public static void main(String[] args) {

        List<String> sList = new ArrayList<String>();

        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jack");

        Stream<String> stream = sList.stream();
        stream.forEach(s-> System.out.print(s+" "));
        System.out.println();

        sList.stream().sorted().forEach(s-> System.out.print(s + " "));
        /*
            이미 한번 만든것을 계속 가져다 쓸 순 없다.
            새로 sList.stream()으로 작성해야 사용할 수 있다.
            sorted는 String에서 comparable이 구현되어있기 때문에
            정렬이 된것이다.
            String이 아닌 직접 만든 클래스로 사용하게 되면
            직접 구현해줘야 한다.
         */

        System.out.println();
        sList.stream().map(s->s.length()).forEach(n-> System.out.println(n));
        //map으로 이름을 가져온다.
        //map은 각 데이터의 길이
        //forEach에서는 map에서 그 길이값을 매개변수로 받아 출력하는 것이다.
    }
}
