package step10.Object;


class Student{
    int studentNum;
    String studentName;

    public Student(int studentNum, String studentName){
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object o) {
        if( o instanceof Student){
            Student std = (Student)o;
            if (this.studentNum == std.studentNum){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode(){
        return studentNum;
        //두개의 넘버가 같은 경우가 같은 것이므로 studentNum만 리턴하면 된다.
    }


}

public class EqualsTest {

    public static void main(String[] args){

        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2);
        //동일한 abc를 갖고 있지만 메모리주소가 다르기 때문에 false가 나온다.

        System.out.println(str1.equals(str2));
        //두개의 문자열이 같은지를 비교했기 때문에
        //true가 출력된다.
        //==와 같은데 각각의 클래스에 맞게 재정의 하기 때문에
        //String이 같다면 이라는게 된다.
        System.out.println("----------------------");

        Student Lee = new Student(100, "이순신");
        Student Lee2 = Lee;
        Student Shin = new Student(100 ,"이순신");

        System.out.println(Lee == Shin);
        //Lee == Lee2는 true지만 이건 false다.
        //메모리주소가 다르기 때문이다.
        //Lee2는 Lee자체이므로 true인거고
        System.out.println(Lee.equals(Shin));
        //equals를 재정의하면서 논리적으로 true를 넘겨줘서 처리할 수 있다.


        System.out.println(Lee.hashCode());
        System.out.println(Shin.hashCode());
        //해시코드를 재정의 했기 때문에 동일한 값이 나온다.

        System.out.println("-----------------------------");
        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println(i1.equals(i2));
        //true가 나온다.

        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());
        /*
        두개의 객체가 같다고 했을 때
        두개의 객체가 갖는 해시코드값도 동일하게끔 재정의 한다.
         */

        System.out.println("-------------");
        System.out.println(System.identityHashCode(i1));
        System.out.println(System.identityHashCode(i2));
        //실제 해시코드 값을 보고 싶다면 이렇게 사용한다.

    }
}
