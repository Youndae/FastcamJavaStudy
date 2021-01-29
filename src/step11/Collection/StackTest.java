package step11.Collection;

import java.util.ArrayList;

class MyStack{
    private ArrayList<String> arrayStack = new ArrayList<String>();

    public void push(String data){
        arrayStack.add(data);
    }

    public String pop(){
        int len = arrayStack.size();

        if(len == 0){
            System.out.println("스택이 비었습니다.");
            return null;
        }

        return arrayStack.remove(len - 1);
    }

    //Stack 소스를 보면 peak이 있는데
    // peak은 꺼내거나 넣거나 하는 것이 아닌 엘레먼트가 뭔지만 보는것이다.
}

public class StackTest {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
