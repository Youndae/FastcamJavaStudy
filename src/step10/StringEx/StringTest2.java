package step10.StringEx;

public class StringTest2 {

    public static void main(String[] args){

        String java = new String("java");
        String android = new String("android");
        System.out.println(System.identityHashCode(java));

        java = java.concat(android);

        System.out.println(java);
        System.out.println(System.identityHashCode(java));
        //이렇게 연결하게 되면 다른 메모리값을 참조한다.


    }
}
