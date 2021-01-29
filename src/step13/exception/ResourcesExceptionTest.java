package step13.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * try with resources방식
 *
 */
public class ResourcesExceptionTest {

    public static void main(String[] args) {


        try(FileInputStream fis = new FileInputStream("a.txt")){

        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
        System.out.println("end");
    }
}
