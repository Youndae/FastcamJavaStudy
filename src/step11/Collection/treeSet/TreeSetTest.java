package step11.Collection.treeSet;

import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();

        treeSet.add("홍길동");
        treeSet.add("강감찬");
        treeSet.add("이순신");

        for(String str : treeSet){
            System.out.println(str);
        }

        /*
            String 클래스에서 Comparable을 정의해놨기 때문에
            오름차순으로 출력된다.
         */
    }
}
