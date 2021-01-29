package oopStudy.Test2.Ex2;

public class Person {

    String name;
    int pay;

    Person(String name, int pay){
        this.name = name;
        this.pay = pay;
    }

    public void buyStarCoffee(StarCoffee sCoffee, int pay){
        String message = sCoffee.payment(pay);
        if(message != null){
            this.pay -= pay;
            System.out.println(name + "님이 "+pay+"원으로 "+message);
        }
    }

    public void buyBeanCoffee(BeanCoffee bCoffee, int pay){
        String message = bCoffee.payment(pay);
        if(message != null){
            this.pay -= pay;
            System.out.println(name + "님이 "+pay+"원으로 "+message);
        }
    }
}
