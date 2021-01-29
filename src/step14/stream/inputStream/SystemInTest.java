package step14.stream.inputStream;

import java.io.IOException;

public class SystemInTest {
//모든 IO는 Exception처리를 해야 한다.
    public static void main(String[] args) {
        System.out.println("입력 : ");

        try {
            int i = System.in.read();
            System.out.println(i);
            System.out.println((char)i);
            /*
                a라고 입력하면
                97
                a
                로 출력된다.
                i는 int니까 아스키코드값으로 97이 출력되는것.
             */
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
