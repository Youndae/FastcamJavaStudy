package step7.inheritance;

/**
 * 테스트 시나리오
 * 일반고객 1명과 VIP고객 1명이 있다.
 * 일반고객의 이름은 이순신, 아이디는 10010, 보너스 포인트는 1000점이다.
 * vip고객의 이름은 김유신, 아이디는 10020, 보너스 포인트는 10000점이다.
 *
 * 두 고객을 생성하고 이에대한 고객정보를 출력하라.
 */
public class CustomerTest {

    public static void main(String[] args) {

        Customer customerLee = new Customer();
        customerLee.setCustomerName("이순신");
        customerLee.setCustomerId(10010);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerName("김유신");
        customerKim.setCustomerId(10020);
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());
    }
}
