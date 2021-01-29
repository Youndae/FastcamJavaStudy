package step10.classEx;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringClassTest {

    public static void main(String[] args) throws ClassNotFoundException {

        /*Class c1 = String.class;

        String str = new String();
        Class c2 = str.getClass();*/

        Class c3 = Class.forName("java.lang.String");

        Constructor[] cons = c3.getConstructors();
        for(Constructor con : cons){
            System.out.println(con);
        }

        /*String str = new String();
        str.
            이렇게 사용하면 되기 때문에
            굳이 위의 반복문처럼 사용할 필요가 없다.
            데이터타입에 대한 정보를 전혀 모를때나 사용하는 것.
        */

        System.out.println("----------------------------------------------------------");

        Method[] methods = c3.getMethods();
        for(Method method : methods){
            System.out.println(method);
        }

    }
}
