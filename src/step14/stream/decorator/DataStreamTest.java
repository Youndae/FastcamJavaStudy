package step14.stream.decorator;

import java.io.*;

public class DataStreamTest {

    public static void main(String[] args) {

        try(FileOutputStream fos = new FileOutputStream("data.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            FileInputStream fis = new FileInputStream("data.txt");
            DataInputStream dis = new DataInputStream(fis)){

            dos.writeByte(100); //int라고 되어있기 때문에 1바이트만 쓴다.
            dos.write(100); //같은 100이 들어가있지만 4바이트로 쓰인다.
            dos.writeChar('A');
            dos.writeUTF("안녕하세요");

            //읽을때는 쓸때와 같은 형식으로 읽어야 한다.
            //data.txt 에 보면
            //dd A 안녕하세요
            //이렇게 나온다.
            //d는 아스키코드값이 100이고
            //A는 Char로 쓴것이니 A
            //UTF로 썼기 때문에 안녕하세요가 들어간다.
            System.out.println(dis.readByte());
            System.out.println(dis.read());
            System.out.println(dis.readChar());
            System.out.println(dis.readUTF());

        }catch(IOException e){
            System.out.println(e);
        }
    }
}
