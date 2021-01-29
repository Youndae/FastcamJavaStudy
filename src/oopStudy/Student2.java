package oopStudy;

/**
 * StudentTest2와 연결
 */
public class Student2 {

    int studentID;
    String studentName;
    String address;



    //학생을 생성할때 항상 학생의 이름을 받고 학번을 초기화 하고 싶다는 가정하에
    public Student2(int id, String name){
        studentID = id;
        studentName = name;
        address = "주소없음";
        System.out.println("constructor : "+studentName + ", " + address+", "+studentID);
    }

    void showStudentInfo(){
        System.out.println(studentName + ", " + address);
    }

}
