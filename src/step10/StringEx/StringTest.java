package step10.StringEx;

public class StringTest {

    public static void main(String[] args){

        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2);
        //각 인스턴스로 잡혔기 때문에 false다.
        //다른 메모리를 참조하니까.

        String str3 = "abc";
        String str4 = "abc";

        System.out.println(str3 == str4);
        //상수풀로 사용하게 되면 동일한 값을 갖고 있으니
        //true가 출력.
    }

}
