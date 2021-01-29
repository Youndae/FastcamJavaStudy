package step14.stream.decoCoffee;

public abstract class Decorator extends Coffee{

    Coffee coffee;

    public Decorator(Coffee coffee){//데코레이터는 혼자 돌아갈 수 없다.
        this.coffee = coffee;
        //그래서 상위클래스의 객체를 갖고 있는다.
    }

    @Override
    public void brewing(){
        coffee.brewing();
        //생성자에서 받은 기능을 호출한다.
        //만약 Input클래스를 호출했다면
        //read기능을 호출하겠다는 것.
    }
}
