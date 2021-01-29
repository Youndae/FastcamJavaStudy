package step14.stream.serialization;

import java.io.*;

class Person implements Serializable {
    String name;
    String job;

    //transient 라는 키워드가 있다.
    //transient String job;
    //이렇게 하면 직렬화 되지 않아서 null로 출력된다.
    //이 변수는 직렬화 하지 말라는 것이다.

    /*Externalizable이라는 인터페이스가 있는데
       serializable은 구현할 메서드가 없는 마크인터페이스이지만
       Externalizable은 구현할 수 있는 메서드가 있다.
       writeExternal과 readExternal이 있는데
       직접 읽고 쓰는것을 구현할 수 있다.
       writeObject와 readObject가 호출이 되면
       호출되는 메서드들이다
       그래서 메서드의 변수를 이용해서 구현할 수 있다.

     */

    public Person(String name, String job){
        this.name = name;
        this.job = job;
    }

    public String toString(){
        return name + ", " + job;
    }
}

public class SerializationTest {

    public static void main(String[] args) {

        Person personLee = new Person("이순신", "엔지니어");
        Person personKim = new Person("김유신", "선생님");

        try(FileOutputStream fos = new FileOutputStream("serial.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){

            oos.writeObject(personLee);
            oos.writeObject(personKim);

        }catch (IOException e){
            System.out.println(e);
        }

        try(FileInputStream fis = new FileInputStream("serial.dat");
            ObjectInputStream ois = new ObjectInputStream(fis)){

            //writeObject로 썼으니 readObject로 쓰면 된다.

            Person p1 = (Person)ois.readObject();//Object로 반환된다.
            Person p2 = (Person)ois.readObject();

            System.out.println(p1);
            System.out.println(p2);

        }catch (IOException e){
            System.out.println(e);
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }

    }
}
