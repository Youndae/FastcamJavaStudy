package oopStudy.cooperation;

public class Taxi {

    int taxiNum;
    int passengerCount;
    int money;

    public Taxi(int taxiNum){
        this.taxiNum = taxiNum;
    }

    public void take(int money){
        this.money += money;
        passengerCount++;
    }

    public void showTaxiInfo(){
        System.out.println(taxiNum + "번 택시의 승객은 "+passengerCount + "명이고 수입은 "+money+"원 입니다.");
    }
}
