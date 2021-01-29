package step8.test;

public abstract class Car {

    public abstract void carName();
    public abstract void start();
    public abstract void drive();
    public abstract void stop();
    public abstract void turnoff();




    public void run(){
        carName();
        start();
        carName();
        drive();
        carName();
        stop();
        carName();
        turnoff();
    }


    /*
        강의 답안
    public void run(){
        start();
        drive();
        stop();
        turnoff();
    }*/
}
