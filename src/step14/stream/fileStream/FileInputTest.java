package step14.stream.fileStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest {

    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
             fis = new FileInputStream("input.txt");
/*
             int i = fis.read();
             //read에 대한 Exception을 처리하라고 하는데
            //읽어오는것이므로 IOException을 처리해줘야 한다.
            //근데 IOException하위에 FileNotFoundException이 있기 때문에
            //처음 catch 에 있던 FileNotFoudException을 IOException으로 바꿔주거나
            //여기서 또 try catch를 만들어주면 된다.

            System.out.println((char)i);

            i = fis.read();
            System.out.println((char)i);
            i = fis.read();
            System.out.println((char)i);
            //여기서는 abc세개만 했고 확인만 하는거니까 그냥 세번 출력문을 작성
*/

            int i;
            while((i = fis.read()) != -1){
                System.out.print((char)i);
            }
                /*파일의 끝까지 읽도록 구현하려면 이렇게 작성한다.
                더이상 읽을 바이트가 없다면 -1이므로
                -1이 되기 전까지 반복하게 한다.*/
            System.out.println();


        } catch (IOException e) {
            e.printStackTrace();
            //printStackTrace로 어디서 에러가 났는지 알 수 있다.
        }finally {
            try {
                fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("end");
    }
}
