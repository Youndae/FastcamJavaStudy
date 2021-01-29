package oopStudy.reference;

public class Student {

    int studentID;
    String studentName;

    /*int KoreaScore;
    int mathScore;
    int engScore;

    String koreaName;
    String mathName;
    String engName;

    이렇게 과목에 대한 정보가 많아지면 성격이 모호해지기 때문에
    이렇게 만드는건 좋은방법이 아니다.*/

    Subject korea;
    Subject math;
    //student에 대한 속성

    public Student(int id, String name){
        studentID = id;
        studentName = name;


        korea = new Subject();
        math = new Subject();
        //String은 그냥 써도 되지만
        //이런 객체들은 생성해서 써야한다.
        //그래서 이런 형태로 사용한다.

    }

    public void setKoreaSubject(String name, int score){
        //studentTest에서 받아다 쓴다.
        //.setKoreaSubject(name, score)형태로 사용하고
        //데이터는 자료형에 맞는 데이터를 넘겨주면
        //여기서 받아서 아래 형태로 넣어주는것.
        korea.subjectName = name;
        korea.score = score;
    }

    public void setMathSubject(String name, int score){
        math.subjectName = name;
        math.score = score;
    }

    public void showStudentScore(){
        int total = korea.score + math.score;
        System.out.println(studentName + " 학생의 총점은 : " + total + "점 입니다.");
    }


}
