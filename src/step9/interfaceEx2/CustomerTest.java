package step9.interfaceEx2;

public class CustomerTest {

    public static void main(String[] args){

        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.sayHello();

        Buy buyer = customer;
        buyer.buy();
        buyer.order();

        Sell seller = customer;
        seller.sell();
        seller.order();

        //디폴트 메소드를 두었다고 해도
        //구현된 인스턴스의 메소드가 호출된다.


    }
}
