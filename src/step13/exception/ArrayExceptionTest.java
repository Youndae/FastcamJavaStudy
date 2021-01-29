package step13.exception;

public class ArrayExceptionTest {

    public static void main(String[] args) {
        int[] arr = new int[5];

        /*for(int i = 0; i <= 5; i++){
            System.out.println(arr[i]);
        }*/
        //마지막 arr[5]는 없기 때문에
        //OutOfBoundException이 발생한다.

        try{
            for(int i = 0; i <= 5; i++){
                System.out.println(arr[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("예외처리");
        }
        System.out.println("프로그램 종료");
    }
}
