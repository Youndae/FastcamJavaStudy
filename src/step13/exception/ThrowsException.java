package step13.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        //FileNotFoundException이 발생할 수 있고
        Class c = Class.forName(className);
        //ClassNotFoundException이 발생할 수 있다.
        //이렇게 throws로 미루게 되면 이 메서드를 호출하는데에서 처리해야 한다.
        return c;
    }

    public static void main(String[] args) {

        ThrowsException test = new ThrowsException();
        try {
            test.loadClass("a.txt", "java.lang.String");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        //여기서 throws를 하면 jvm으로 넘어가기 때문에 결국 핸들링하는게 아닌것이 된다.
        //여기서는 try catch를 해야 한다.
        //실행하면 fileNotFoundException이 먼저 발생하기 때문에
        //FileNotFoundException만 처리된다.
        //a.txt로 파일명을 바꾸면 classNotFoundException 이 발생한다.
        //java.lang.string으로 만들었으니 발생하는 것.
        //java.lang.String으로 수정하면 다 수행되고 end만 출력되는것을 확인할 수 있다.

        /*
            catch(Exception e){

            }
            이것은 최상위 클래스인 Exception 으로 나머지 예외를 처리하겠다는 것이다.
            그래서 제일 마지막에 작성해줘야 한다.
            만약 위 코드에서 맨 처음에 Exception으로 처리를 한다면
            모든 예외처리는 이곳에서 처리되기 때문이다.
            상황에 맞는 log를 남겨야 하는데 Exception으로 처리해버리면
            모든 것을 다 동일하게 처리하기 때문이다.
            default Exception이라고도 한다.
         */


        /*try{
            test.loadClass("a.txt", "java.lang.String");
        }catch(FileNotFoundException | ClassNotFoundException e){
            e.printStackTrace();
        }
            이렇게 멀티블록으로도 만들 수 있다.
        */

        System.out.println("end");


    }
}
