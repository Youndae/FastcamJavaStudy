package oopStudy;

public class StudentTest2 {

    public static void main(String[] args) {
        Student2 studentLee = new Student2(1, "홍길동");

        studentLee.studentName = "이순신";
        studentLee.address = "서울";

        studentLee.showStudentInfo();

    }
}
