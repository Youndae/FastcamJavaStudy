package step7.polymorphism;

/**
 * VIPCustomer 클래스의 기능
 * 단골고객으로 혜택이 더 다양해진다
 * 제품구매시 10%할인
 * 보너스포인트 5%적립
 * 담당상담원 배정
 * Customer클래스와 유사하지만 그보다 더 많은 속성과 기능이 필요.
 */
public class VIPCustomer extends Customer {

    double salesRatio;
    private int agentId;

    public VIPCustomer(int customerId, String customerName){
        super(customerId, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        //override 어노테이션을 선언했기때문에
        //선언부가 다르면 오류가 발생한다.

        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
        //이와같이 상위 클래스의 메소드와 다른 연산처리를 하고
        //다른 값을 반환할 수 있게 하는 것이 override다.

    }
}
