package step13.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * a.txt를 프로젝트에 만들어 주면
 * finally
 * end
 * 가 제대로 출력되는 것을 확인할 수 있다.
 *
 * 주석의 오류를 보려면 a.txt삭제.
 */
public class ExceptionTest {

    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("a.txt");
            /*fis.close();
            * FileInputStream은 닫아줘야 한다.
            * 여기서 close를 해도 되지만
            * 만약 오류가 발생한다면 여기까지 도달하지 않기 때문에
            * finally에서 처리하도록한다.
            * */

        } catch (FileNotFoundException e) {
            System.out.println(e);
            return;
        }finally{//finally는 try가 되면 무조건 실행된다.
            try {
                fis.close();
                //null이기 때문에 Exception이 발생해서
                //아래 출력문을 거치지 않고 catch로 넘어간다.
                System.out.println("finally");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("end");
        //catch에서 return 을 했기 때문에 end는 출력이 안되는것.

    }
}
