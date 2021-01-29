package step9.interfaceEx2;

public class Customer implements Buy, Sell{
//하나의 클래스는 여러개의 인터페이스를 상속받을 수 있다.

    @Override
    public void buy() {
        System.out.println("customer buy");
    }

    @Override
    public void order() {
        System.out.println("customer order");

        //인텔리제이에서는 그냥 이정도만 뜨는데 이클립스에서 override시키면
        //buy.super.order();
        //이게 붙어서 나온다.
        //buy의 order를 가져다 쓰겠다는 것.
        //이걸 여기서 재정의하지 않으면
        //두 인터페이스에서 동일한 디폴트 메소드를 갖고 있는 것이므로
        //어느것을 찾아야 될지 몰라서 오류가 발생한다.
    }

    @Override
    public void sell() {
        System.out.println("customer sell");
    }

    public void sayHello(){
        System.out.println("Hello");
    }
}
