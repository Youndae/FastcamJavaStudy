package step14.stream.fileStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest3 {

    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("input2.txt")) {

            int i;
            byte[] bs = new byte[10];
            while((i = fis.read(bs)) != -1){
                //for(byte b : bs)
                //    System.out.print((char)b);
                /*
                ABCDEFGHIJ
                KLMNOPQRST
                UVWXYZQRST
                이렇게 출력된다.
                마지막 줄에 QRST는 버퍼에 남은 가비지다.
                overwrite가 안되었기때문에 남은것이다.
                이런경우에는 읽은 개수를 알고 있어야 한다.
                그런 경우 아래와 같이 작성한다.
                */

                for(int k = 0; k < i; k++){
                    System.out.print((char)bs[k]);
                }
                /*
                    이렇게 작성하면 길이만큼만 출력하므로
                    가비지가 출력되지 않는다.
                 */


                System.out.println();
            }


        } catch (IOException e) {
            e.printStackTrace();

        }
        System.out.println("end");
    }
}
