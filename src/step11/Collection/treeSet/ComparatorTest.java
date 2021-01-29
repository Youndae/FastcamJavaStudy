package step11.Collection.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

    @Override
    public int compare(String s1, String s2){
        return s1.compareTo(s2) * (-1);
    }
}

public class ComparatorTest {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("홍길동");
        treeSet.add("강감찬");
        treeSet.add("이순신");

        for(String str : treeSet){
            System.out.println(str);
        }

        //여기까지만 본다면 String이 이미 Comparable이 구현되어 있기 때문에
        //오름차순으로 출력된다.
        //근데 내림차순으로 하고 싶다면
        //위의 MyCompare 클래스를 만들어 새로 구현하면 된다.


        TreeSet<String> treeSet2 = new TreeSet<String>(new MyCompare());
        treeSet2.add("홍길동");
        treeSet2.add("강감찬");
        treeSet2.add("이순신");

        for(String str : treeSet){
            System.out.println(str);
        }

        //새로 구현한 Compare를 쓰기 위해 new MyCompare를 추가해준다.
        //이미 comparable이 구현된 클래스가 있는 경우에는
        //따로 구현을 해준 뒤 생성자에 추가하여 이 방식으로 정렬하라고
        //알려줄 수 있다.
    }
}
