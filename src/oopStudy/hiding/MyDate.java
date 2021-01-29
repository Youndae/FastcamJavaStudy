package oopStudy.hiding;

public class MyDate {

    private int day;
    private int month;
    private int year;

    private boolean isValid;

    public void setDay(int day){
        this.day = day;
        //앞 day는 private int day의 day이고
        //뒤에있는 day는 메소드의 int day의 day다.
        //만약 this를 뺀다면 가장 가까운데서 값을 찾기 때문에
        //메소드에서의 int day의 day가 된다.
    }

    public int getDay(){
        return day;
    }

    public void setMonth(int month){
        if(month >= 1 && month <= 12){
            isValid = true;
            this.month = month;
        }
    }

    public int getMonth(){
        return month;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    public void showDate(){
        if(isValid){
            System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
        }else{
            System.out.println("유효하지 않은 날짜입니다.");
        }
    }
}
