package step14.stream.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

    public static void main(String[] args) throws IOException {

        /*FileInputStream fis = new FileInputStream("reader.txt");

        int i;
        while((i = fis.read()) != -1){
            System.out.print((char)i);
        }

        fis.close();
        이렇게 작성하면 바이트단위이기 때문에 한글이 다 깨진다.

        */

        FileReader fis = new FileReader("reader.txt");

        int i;
        while((i = fis.read()) != -1){
            System.out.print((char)i);
        }

        fis.close();
        //문자를 읽을때는 이렇게 FileReader를 이용해 읽으면 된다.


        /*
        FileInputStream fis = new FileInputStream("reader.txt");
        이렇게만 읽으면 바이트 단위로 읽는 것이고
        InputStreamReader isr = new InputSteramReader(fis);
        이렇게 InputStreamReader로 감싸주면 된다.
        constructor에 InputStream을 넣어주면 된다.
        InputStreamReader는 보조스트림.

        int i;
        while((i = isr.read()) != -1){ //fis를 isr로 감싸주었으니 isr을 읽어야한다.
            System.out.print((char)i);
        }

        isr.close(); //닫는것도 마찬가지로 isr을 닫아주어야 한다.
        보조스트림을 close하면 원래 스트림까지 close가 된다.
         */
    }
}
