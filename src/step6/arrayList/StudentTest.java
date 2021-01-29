package step6.arrayList;

/**
 * Lee학생은 두 과목을 수강하고, Kim학생은 세과목을 수강한다.
 * 각 학생의 학점과 총점을 다음과 같이 출력할것.
 *
 * Student클래스에 ArrayList 멤버변수를 하나 가지고 각 학생이 수강하는 과목을
 * 관리하도록 한다.
 *
 * 학생 Lee님의 국어 과목의 성적은 100점입니다.
 * 학생 Lee님의 수학 과목의 성적은 90점입니다.
 * 학생 Lee님의 총점은 190점 입니다.
 *
 * 학생 Kim님의 국어 과목의 성적은 100점입니다.
 * 학생 Kim님의 수학 과목의 성적은 90점입니다.
 * 학생 Kim님의 영어 과목의 성적은 80점입니다.
 * 학생 Kim님의 총점은 270점 입니다.
 */
public class StudentTest {

    public static void main(String[] args) {
        Student studentLee = new Student(1001, "Lee");
        Student studentKim = new Student(1002, "Kim");

        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 90);

        studentKim.addSubject("국어", 100);
        studentKim.addSubject("수학", 90);
        studentKim.addSubject("영어", 80);

        studentLee.showStudentInfo();
        System.out.println("================");
        studentKim.showStudentInfo();
    }
}
