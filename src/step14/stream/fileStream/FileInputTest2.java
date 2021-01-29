package step14.stream.fileStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * with resouces로 구현
 */
public class FileInputTest2 {

    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("input.txt")) {

            int i;
            while((i = fis.read()) != -1){
                System.out.print((char)i);
            }

            System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
            //printStackTrace로 어디서 에러가 났는지 알 수 있다.
        }
        System.out.println("end");
    }
}
