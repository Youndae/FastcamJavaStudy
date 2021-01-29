package oopStudy.Test2.Ex1;

/**
 * 날짜의 유효성을 검증하는 프로그램 구현
 *
 * day, month, year변수는 private으로 선언
 * 각 변수의 getter, setter를 public 으로 구현
 * MyDate(int day, int month, int year)생성자 만들것
 * isValid를 만들어 날짜 유효성 체크
 * MyDateTest에서 생성한 MyDate날짜가 유효한지 확인.
 *
 * 결과값은
 * 유효한 날짜입니다.
 * 유효하지 않은 날짜입니다.
 * 둘중 하나 출력.
 */
public class MyDateTest {

    public static void main(String[] args) {
        MyDate date1 = new MyDate(30, 2, 2000);
        System.out.println(date1.isValid());
        MyDate date2 = new MyDate(2, 10, 2006);
        System.out.println(date2.isValid());
    }
}
