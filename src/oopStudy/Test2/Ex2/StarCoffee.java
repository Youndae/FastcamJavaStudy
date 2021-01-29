package oopStudy.Test2.Ex2;

public class StarCoffee {

    int pay;

    public String payment(int pay){

        this.pay += pay;
        if(pay == Menu.StarAmericano){
            return "별다방 아메리카노를 구입했습니다.";
        }else if(pay == Menu.StarLatte){
            return "별다방 라떼를 구입했습니다.";
        }else{
            return null;
        }
    }
}
