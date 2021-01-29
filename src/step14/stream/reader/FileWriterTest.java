package step14.stream.reader;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("writer.txt");

        fw.write('A'); //char형태

        char[] buf = {'B', 'C', 'D', 'E', 'F'};
        fw.write(buf); // char buffer형태


        fw.write(" 안녕하세요"); //String형태

        fw.write(buf, 2, 2); //offset, length형태
        //buf의 2번 인덱스부터 2개. D, E를 의미.

        fw.close();

        System.out.println("end");

    }
}
