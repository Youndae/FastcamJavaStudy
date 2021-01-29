package oopStudy.staticEx;

/**
 * 학생이 생성될때마다 학생의 id를 새로 부여한다.
 * 기준값이 있어야하고 그 기준값에서 점점 증가해야한다.
 * 그 기준이 되는 값은 모든 인스턴스가 같은곳을 바라봐야 한다.
 * 따로따로 인스턴스가 생기는 것이 아니라 그 기준이 되는 값은
 * 모든 인스턴스가 하나의 메모리를 봐야한다.
 *
 */
public class Student {

    private static int serialNum = 1000;
    //중요한 변수고 밖에서 수정을 한다면 문제가 발생할 수 있기 때문에
    //private으로 만드는게 맞다.
    //하지만 private으로 만들면 그냥 가져다 쓸 수 없기 때문에
    //getter, setter를 만들어줘야 한다.

    public static int getSerialNum() {

        /*
            studentName = "Lee";
            이렇게 static메소드 안에서 인스턴스 변수를 사용할 수는 없다.
            static메소드는 인스턴스의 생성과 상관없이 호출되는 메소드다.
            근데 이 값을 넣으려면 인스턴스가 new되어야 하기 때문에 사용할 수 없다.

            반대로 일반 메소드에서 static변수를 사용하는것은 문제가 안되는데
            static변수는 프로그램이 메모리에 로드될때 생성이 되기 때문에
            상관없다.
         */
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student.serialNum = serialNum;
    }

    private int studentId;
    public String studentName;
    public String address;

    public Student(String name){
        studentName = name;
        serialNum++;
        studentId = serialNum;
    }

    public Student(int id, String name){
        studentId = id;
        studentName = name;
        address = "주소없음";
        serialNum++;
        studentId = serialNum;
    }

    public void showStudentInfo(){
        System.out.println(studentName + ", "+address);
    }

    public String getStudentName(){
        return studentName;
    }

    public int getStudentId(){
        return studentId;
    }
}
