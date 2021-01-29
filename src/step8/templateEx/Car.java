package step8.templateEx;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public void startCar(){
        System.out.println("시동을 켭니다.");
    }

    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }

    public void washCar(){}

    final public void run(){
        startCar();
        drive();
        stop();
        turnOff();
        washCar();
        /*
            구현된 메소드들 중에서는 하위클래스에서 재정의할 수 있지만
            시나리오가 되는 틀이되는 메소드들은 재정의하면 안되기때문에
            final을 사용해서 재정의 할 수 없도록 한다.
         */
    }
}
