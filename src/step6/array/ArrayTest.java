package step6.array;

public class ArrayTest {

    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] arr1 = new int[] {1, 2, 3};
        //아래의 경우는 선언과 동시에 초기화하는 경우이다.
        //단 이경우에는 []안에 숫자를 쓰지 않는다.

        int[] arr2 = {1, 2, 3};
        //만약 선언과 동싱에 초기화 한다면 이렇게도 사용이 가능하다.

        /*
            int[] arr;
            arr = {1, 2, 3}
            이런 형태는 불가능하다.
            차라리
            arr = new int[] {1,2,3}
            이렇게는 가능하다.
         */
        int total = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = i+1;
            System.out.println(arr[i]);
            total += arr[i];
        }
        System.out.println("total : "+total);

        /**
         * 문자배열을 생성하고 출력하라.
         * 대문자 A-Z까지 배열에 저장하고 이를 다시 출력하는 프로그램을 만들것
         */

        char[] arr4 = new char[26];
        int a = 65;

        for(int i = 0; i < arr4.length; i++){
            arr4[i] = (char)a++;
            System.out.println(arr4[i]);

        }


    }






}
