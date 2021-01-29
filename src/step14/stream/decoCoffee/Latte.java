package step14.stream.decoCoffee;

public class Latte extends Decorator{

    public Latte(Coffee coffee){
        super(coffee);
    }

    @Override
    public void brewing(){ //재정의
        super.brewing();//상위클래스 기능을 한번 호출
        System.out.print("Adding Milk");
    }
}
