package oopStudy.thisex;

public class PersonTest {
    public static void main(String[] args) {
        Person personName = new Person();

        personName.showInfo();

        Person personLee = new Person("Lee", 20);
        personLee.showInfo();
        System.out.println(personLee);

        Person p = personLee.getSelf();
        System.out.println(p);
        //this가 가리키는것과
        //참조변수가 가리키는 것이 같다 라는것을 증명해주는 출력문.
    }
}
