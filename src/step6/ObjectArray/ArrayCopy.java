package step6.ObjectArray;

public class ArrayCopy {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {1, 2, 3, 4, 5};
        //기본자료형의 복사
        System.arraycopy(arr1, 0, arr2, 1, 3);
        //System.arraycopy(src, srcPos, dest, destPos, length);
        //이런 형태다.
        //소스, 소스에서의 위치, 데스티네이션, 데스티네이션에서의 위치, 길이(개수)
        //소스에서 몇번째 위치에서부터 있는 값을 length만큼 데스티네이션의 해당 위치에서부터
        //붙여넣는다.
        //arr1의 0번째부터 length(3)개만큼 복사해서 arr2에 1번 인덱스부터 붙여넣는다.

        for(int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
            //출력값 1 10 20 30 5
        }
    }
}
