package step9.interfaceEx2;

public class MyClass implements MyInterface{
    //myclass는 myinterface타입이기도 하지만
    //X타입이기도 하고 Y 타입이기도 하다.
    //결국 MyInterface가 x랑 y를 상속받는데
    //이걸 상속받았으니 다 쓸 수 있는것.

    @Override
    public void myMethod() {

    }

    @Override
    public void x() {

    }

    @Override
    public void y() {

    }
}
