package step14.stream.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

    public static void main(String[] args) throws IOException {

        RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");

        rf.writeInt(100);
        System.out.println(rf.getFilePointer());
        //위치를 알 수 있다. Int는 4바이트니까 4의 위치에 있어서 4가 출력된다.
        rf.writeDouble(3.14);
        rf.writeUTF("안녕하세요");

        //int i = rf.readInt();
        //현재 위치는 안녕하세요에 있기 때문에 그냥 이렇게 출력하면 오류가 발생한다.


        rf.seek(0);//처음위치로 이동시켜준다.
        int i = rf.readInt();
        double d = rf.readDouble();
        String str = rf.readUTF();

        System.out.println(i);
        System.out.println(d);
        System.out.println(str);

    }
}
