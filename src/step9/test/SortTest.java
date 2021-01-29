package step9.test;

import java.io.IOException;
import java.util.*;

/**
 * 정렬방식을 선택하세요.
 * B : BubbleSort
 * H : HeapSort
 * Q : QuickSort
 *
 * B를 입력했다면
 *
 * BubbleSort ascending
 * BubbleSort descending
 * 숫자를 정렬하는 알고리즘입니다.
 * BubbleSort입니다.
 */
public class SortTest {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("정렬방식을 선택하세요");
        System.out.println("B : BubbleSort");
        System.out.println("H : HeapSort");
        System.out.println("Q : QuickSort");

        int ch = System.in.read();

        Sort sort = null;

        if(ch == 'B' || ch == 'b'){
            sort = new BubbleSort();
        }else if(ch == 'H' || ch == 'h'){
            sort = new HeapSort();
        }else if(ch == 'Q' || ch == 'q'){
            sort = new QuickSort();
        }else{
            System.out.println("잘못입력");
            return;
        }

        sort.ascending(arr);
        sort.descending(arr);

        sort.description();

    }
}
