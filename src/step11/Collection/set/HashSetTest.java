package step11.Collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();
        set.add("이순신");
        set.add("강감찬");
        set.add("김유신");
        set.add("이순신");

        System.out.println(set);
        //순서대로 출력되지 않는다.
        //해시방식으로 관리하는데
        //그 방식으로 관리되기 때문에 입력하는 순서와는 다르게 출력된다.
        //HashSet이 아닌 ArrayList로 만들어 출력하게 되면
        //중복도 허용하고 입력된 순서대로 출력되지만
        //HashSet으로 만들면 중복을 허용하지 않고
        //순서도 입력순이 아닌 다른 순서로 출력된다.

        //하나씩 돌아가면서 쓰고싶다고 하면 Iterator를 쓴다.
        Iterator<String> ir = set.iterator();

        while(ir.hasNext()){ //다음 값이 있다면 true 없다면 false
            String str = ir.next();//다음 값을 호출
            System.out.println(str);
        }

    }
}
