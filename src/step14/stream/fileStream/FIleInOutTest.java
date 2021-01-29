package step14.stream.fileStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * OutputStream으로 쓰고
 * InputStream으로 읽도록 만든다.
 */
public class FIleInOutTest {

    public static void main(String[] args) {

        byte[] bs = new byte[26];
        byte data = 65;
        for(int i = 0; i < bs.length; i++){
            bs[i] = data;
            data++;
        }

        try(FileOutputStream fos = new FileOutputStream("InOut.txt", true);
            FileInputStream fis = new FileInputStream("InOut.txt")){


            fos.write(bs);

            int ch;
            while((ch = fis.read()) != -1){
                System.out.print((char)ch);
            }


        }catch (IOException e){
            System.out.println(e);
        }
    }
}
