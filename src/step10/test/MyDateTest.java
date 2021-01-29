package step10.test;

import java.util.Objects;

/**
 * 날짜를 구현한 클래스 MyDate가 있다.
 * 날짜가 같으면 equals 메소드의 결과가 true가 되도록 구현할것
 * hashCode메소드도 구현
 *
 */

class MyDate{
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyDate)) return false;
        MyDate myDate = (MyDate) o;
        return day == myDate.day &&
                month == myDate.month &&
                year == myDate.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
    인텔리제이에서 equals랑 hashcode generate했을 때 나오는것.
    이렇게 해도 true나오긴 한다.
    */

    @Override
    public boolean equals(Object o){
        if(o instanceof MyDate){
            MyDate date = (MyDate)o;
            if(this.day == date.day && this.year == date.year && this.month == date.month)
                return true;
            return false;
        }
        return false;
    }

    @Override
    public int hashCode(){
        return day*11 + month*101 + year*1001;
    }
}

public class MyDateTest {

    public static void main(String[] args){
        MyDate date1 = new MyDate(10, 12, 2020);
        MyDate date2 = new MyDate(10, 12, 2020);

        System.out.println(date1.equals(date2));
    }
}
