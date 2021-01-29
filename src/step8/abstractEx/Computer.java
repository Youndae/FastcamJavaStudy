package step8.abstractEx;

public abstract class Computer {

    public abstract void display();
    public abstract void typing();

    public void turnOn(){
        System.out.println("전원을 켬니다.");
    }

    public void turnOff(){
        System.out.println("전원을 끕니다.");
    }
}
