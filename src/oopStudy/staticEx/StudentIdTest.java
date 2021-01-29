package oopStudy.staticEx;

public class StudentIdTest {

    public static void main(String[] args) {

        System.out.println(Student.getSerialNum());
        /* static변수는 객체가 생성되는것과 상관없다.
         * 그래서 객체가 생성될 때 사용하는 참조변수를 쓰는게 아니라
         * 클래스 이름으로 access한다.
         *
         * 만약 인스턴스를 하나도 생성하지 않았다고 해도
         * 사용하는데는 아무런 문제가 생기지 않는다.
         *
         * getter, setter로 사용한다고해서
         * 사용방법이 바뀌지않는다.
         * */


        Student studentLee = new Student("Lee");
        System.out.println(studentLee.getSerialNum());

        Student studentKim = new Student("Kim");
        System.out.println(studentKim.getSerialNum());
        System.out.println(studentLee.getSerialNum());

        /*
        생성자가 호출될때마다 serialNum이 ++이 되고
        인스턴스마다 따로 잡혔다고 하면
        아래 출력문 두개가 동일하지 않을것이다.
        근데 동일한것을 보면 두개가 같은 메모리를 바라보고 있다고 볼 수 있다.

        static은 데이터 영역에 존재한다고 했다.
        생성자가 한번 불리면서 serialNum이 ++되는데
        studentLee를 만들면서 호출된 생성자로 인해 ++이 되서 1001이 되었고
        Kim을 만들면서 한번 더 호출되서 또 ++이 되어 1002가 된것이다.
        아래 두 출력문이 동일한 1002를 호출한다는것이
        같은 메모리를 바라보고 있다고 했는데 결국 이것은
        serialNum이라는 값만을 보고 있다고 보면 된다.

        이전 예제에서는 Lee.Name과 Kim.Name이 다르게 출력되었다.
        그건 Name이라는 인스턴스가 생성되며 값을 넣어준
        Lee만의 인스턴스이기 때문이고
        serialNum의 경우는 그것과 상관없이 가져다 쓰는것이다.

        Lee.serialNum은 결국 Lee라는 이름을 가진것일 뿐
        결국 Student클래스에 있는 serialNum을 출력하라는 것이다.
        그래서 Kim으로 serialNum을 1002로 만들어줬기 때문에
        그 아래에 Lee.serialNum을 출력해도 1002로 출력되는 것이다.

         */

        System.out.println(studentLee.getStudentId());
        System.out.println(studentKim.getStudentId());

        /*
        학번으로 만들어주기 위해 Student클래스에서
        studentId에 serialNum을 넣어줬다.
        그럼 studentId는 인스턴스로 serialNum을 받고
        Lee, Kim만의 값이 되는 것이다.
         */
    }
}
