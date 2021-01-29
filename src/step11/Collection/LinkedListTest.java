package step11.Collection;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<String>();

        myList.add("A");
        myList.add("B");
        myList.add("C");

        System.out.println(myList);
        //대부분의 collection 은 toString이 제공된다.

        myList.add(1, "D");
        System.out.println(myList);

        myList.removeLast();
        System.out.println(myList);

        for(int i = 0; i < myList.size(); i++){
            String s = myList.get(i);
            System.out.println(s);
            //List인터페이스가 아닌 set인터페이스에서는 이렇게 사용할 수 없다.
        }
    }
}
