package step14.stream.decorator;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.*;
import java.net.Socket;

public class FileCopy {

    public static void main(String[] args) throws IOException {

        long milliseconds = 0;

        try(FileInputStream fis = new FileInputStream("a.zip");
            FileOutputStream fos = new FileOutputStream("copy2.zip");
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos)){

            milliseconds = System.currentTimeMillis();
            //현재시간

            int i;
            while((i = bis.read()) != -1){
                bos.write(i);
            }

            milliseconds = System.currentTimeMillis() - milliseconds;
            //현재시간 - 이전시간으로 시간차를 구해 처리시간을 구한다.

        }catch(IOException e){
            System.out.println(e);
        }

        //보조스트림은 기반스트림만 감싸는것이 아닌 또다른 보조스트림도 감싸준다.

        Socket socket = new Socket();

        //소켓에서 읽어들일때 socket.getInputStream을 사용해 가져오는데
        //socket.getInputStream().read() 이렇게 하면 영문만 읽을 수 있다.
        //그래서 InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        //이렇게 감싸주는데 이렇게 되면 소켓에서 바이트 단위로 읽는 것을 문자단위로 읽을 수 있게 된다.
        //이것을 또 아래처럼 BufferedReader로 감싸게 되면
        //읽을때 버퍼링기능까지 가져올 수 있게 된다.
        //그럼 getInputStream으로 가져와서 StreamReader로 감싸서 문자로 읽게 한다음
        //BufferedReader로 버퍼링으로 해서 좀 더 빠르게 읽게 하는것이다.

        //BufferedReader에는 readLine이 있는데 여기에만있다.
        //한줄만 읽거나 문장에서 한줄씩 읽을 수 있는 기능이다.

        //보조스트림이 하나의 다른 스트림을 감싸는데 그 스트림은 또 InputStream을 감싸줄 수 있는 것이다.
        //이런것이 Decorator Pattern이다.
        //이런것을 상속으로 구현한다면 엄청 복잡해진다.
        //


        BufferedReader isr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        isr.readLine();

        System.out.println("시간 : "+milliseconds);
    }

    //FileInputStream과 FileOutputStream만 사용했을 때
    //32724 가 출력되었는데 32초 정도 걸렸다고 볼 수 있다.

    //BufferedInputStream과 BufferedOutPutStream으로 감싸준 뒤 처리했을 때는
    //77이 출력되었다.
    //속도 차이가 많이 나는 것을 확인할 수 있다.
}
