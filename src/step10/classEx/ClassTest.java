package step10.classEx;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Person person = new Person("James");
        System.out.println(person);

        Class c1 = Class.forName("step10.classEx.Person");
        Person person1 = (Person)c1.newInstance();//new Instance는 default Contructor를 호출한다.
        System.out.println(person1);
        //toString에서 부르는것이 name인데 아무것도 안써줬기 때문에 null이 나온다.

        Class[] parameterType = {String.class};
        Constructor cons = c1.getConstructor(parameterType);

        Object[] initargs = {"김유신"};

        Person personLee = (Person)cons.newInstance(initargs);
        System.out.println(personLee);
        //이건 매개변수가 있는 constructor기 때문에 김유신이 출력된다.

    }
}
