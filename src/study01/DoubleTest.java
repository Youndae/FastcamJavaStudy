package study01;

public class DoubleTest {
    public static void main(String[] args) {

        double dNum = 3.14;

        float fNum = 3.14f;
        //그냥 3.14 라고 쓰면 double로 인식하기 때문에 오류발생.
        //뒤에 f를 붙여줌으로써 float으로 사용하겠다고 알려줘야 한다.

        System.out.println(dNum);
        System.out.println(fNum);
    }
}
