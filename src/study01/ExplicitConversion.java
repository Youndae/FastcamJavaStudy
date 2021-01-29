package study01;

/**
 * 명시적 형변환
 */
public class ExplicitConversion {

    public static void main(String[] args) {
        int i = 1000;
        byte bNum = (byte)i;
        //이렇게 자료형을 명시해서 자료형을 변환한다면
        //자료의 손실이 발생할 수 있다.
        //byte는 127까지만 사용할 수 있는데
        //변환하고자 하는 값은 1000이기 때문에.

        System.out.println(bNum);
        //결과값이 -24로 출력된다.

        double dNum1 = 1.2;
        float fNum = 0.9F;

        int iNum1 = (int)dNum1 + (int)fNum;
        int iNum2 = (int)(dNum1 + fNum);

        System.out.println(iNum1);
        //결과값 1
        //int로 형변환되면 소수점 자리는 날아가고 정수만 남는다.
        //그래서 1과 0을 더해서 결과값은 1
        System.out.println(iNum2);
        //연산 후 int로 변환했기 때문에 2.1이 변환되어 결과값이
        //2가 출력된다.
    }
}
