package study01;

/**
 * 묵시적 형변환
 */
public class implicitConversion {

    public static void main(String[] args) {

        byte bNum = 10;
        int iNum = bNum;

        System.out.println(bNum);
        System.out.println(iNum);

        int iNum2 = 20;
        float fNum = iNum2;

        System.out.println(fNum);

        double dNum;
        dNum = fNum + iNum;
        //iNum은 int형이지만 float형태로 변환되어 fNum이랑 연산이 되고
        //연산 처리 된 값은 double형으로 다시한번 형변환이 된다.
        System.out.println(dNum);
    }
}
