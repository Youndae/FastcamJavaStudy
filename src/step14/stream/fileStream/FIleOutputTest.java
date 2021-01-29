package step14.stream.fileStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FIleOutputTest {

    public static void main(String[] args) {

        try(FileOutputStream fos = new FileOutputStream("output.txt", true)){
            //파일명 뒤에 true를 쓰면 계속 append가 된다.

            fos.write(65);
            fos.write(66);
            fos.write(67);
            //이대로 실행하면 output.txt파일이 생성되고 abc가 들어가있다.

        }catch (IOException e){
            System.out.println(e);
        }
    }
}
