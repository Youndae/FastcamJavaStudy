package step6.test1;

/**
 * 어느 학교에 학생이 3명있다.
 * 각 학생마다 읽은 책을 기록하고 있다.
 * Student클래스를 만들고 각 학생마다 읽은 책을 Student클래스 내에 ArrayList를
 * 생성하여 관리하도록 한다.
 * 다음과 같이 출력되도록 Student, Book, StudentTest 클래스를 만들어 실행하라
 *
 * Lee 학생이 읽은 책은 : 태백산맥1 태백산맥2 입니다.
 * kim 학생이 읽은 책은 : 토지1 토지2 토지3 입니다.
 * Cho 학생이 읽은 책은 : 해리포터1 해리포터2 해리포터3 해리포터4 해리포터5 해리포터6 입니다.
 */
public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student("Lee");
        Student studentKim = new Student("Kim");
        Student studentCho = new Student("Cho");

        studentLee.addBook("태백산맥1");
        studentLee.addBook("태백산맥2");

        studentKim.addBook("토지1");
        studentKim.addBook("토지2");
        studentKim.addBook("토지3");

        studentCho.addBook("해리포터1");
        studentCho.addBook("해리포터2");
        studentCho.addBook("해리포터3");
        studentCho.addBook("해리포터4");
        studentCho.addBook("해리포터5");
        studentCho.addBook("해리포터6");


        studentLee.showInfo();
        studentKim.showInfo();
        studentCho.showInfo();
    }
}
