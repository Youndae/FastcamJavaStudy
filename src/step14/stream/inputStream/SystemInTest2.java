package step14.stream.inputStream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {
//모든 IO는 Exception처리를 해야 한다.
    public static void main(String[] args) {
        System.out.println("입력 : ");

        /*try {
            int i;
            while((i = System.in.read()) != '\n'){
                System.out.print((char)i);
            }
            *//*
              엔터를 누르기 전까지 입력한 모든 문자를 출력하게 된다.
             *//*

        } catch (IOException e) {
            e.printStackTrace();
        }*/

        System.out.println("입력 후 끝이라고 쓰세요 :");

        /*try {
            int i;
            while((i = System.in.read()) != '끝'){
                System.out.print((char)i);
            }

                끝 을 인식을 못한다.
                한글은 2바이트고 i는 int타입지만 1바이트씩만 읽기 때문에
                끝이라는 문자를 인식할 수 없는 것이다.
                in 은 inputstream이기 때문에 1바이트씩밖에 읽지 못한다.
                그래서 int가 1바이트만 인식하는것.



        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try {
            int i;
            InputStreamReader isr = new InputStreamReader(System.in);
            while((i = isr.read()) != '끝'){
                System.out.print((char)i);
            }
            /*
                보조스트림인 InputStreamReader를 사용해서 멀티바이트를 인식할 수 있도록 해야 한다.
                InputStreamReader는 읽어들인 것을 문자로 반환한다.
                항상 다른 스트림을 생성자의 매개변수로 받는다.
                InputStreamReader에서 System.in을 매개변수로 받았기 때문에
                while에서는 보조스트림으로 읽으면 되는것이다.

                asdjfklasjdfl 끝 이라고 입력하면
                asdjfklasjdfl 이렇게 출력된다.

                바이트단위로 자료를 읽을 때 그 자료를 문자로 변환해주는 것이
                InputStreamReader다.

             */


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
