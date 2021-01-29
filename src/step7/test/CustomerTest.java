package step7.test;

import java.util.ArrayList;

/**
 * 고객이 늘어 VIP 고객만큼 물건을 많이 구입하지 않지만 단골인 분들을 GOLD등급으로
 * 관리하고 싶다.
 * 혜텍은 다음과 같다.
 *
 * 제품을 살때는 항상 10%를 할인해준다.
 * 보너스포인트는 2%를 적립한다.
 * 담당 전문 상담원은 없다.
 *
 * Customer클래스에서 상속을 받아 GoldCustomer를 구현해볼것.
 *
 * 고객은 현재 5명이다.
 * VIP1명 GOLD2명 SILVER2명일때, 각 고객이 10000원짜리 제품을 구매한 경우
 * 지불한 금액과 적립된 보너스 포인트를 출력할것.
 *
 * ArrayList를 사용.
 */
public class CustomerTest {

    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<Customer>();

        Customer customerLee = new Customer(10010, "이순신");
        Customer customerShin = new Customer(10020, "신사임당");
        Customer customerHong = new GoldCustomer(10030, "홍길동");
        Customer customerYul = new GoldCustomer(10040, "이율곡");
        Customer customerKim = new VIPCustomer(10050, "김유신", 12345);

        customerList.add(customerLee);
        customerList.add(customerShin);
        customerList.add(customerHong);
        customerList.add(customerYul);
        customerList.add(customerKim);

        System.out.println("=========고객정보출력==========");

        for(Customer customer : customerList){
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println("==========할인율과 보너스 포인트 계산==========");

        int price = 10000;
        for(Customer customer : customerList){
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + "님이 "+cost+"원 지불하셨습니다.");
            System.out.println(customer.getCustomerName()+"님의 보너스 포인트는 "+customer.bonusPoint+"점 입니다.");
        }

        System.out.println("==========================================");
        for(Customer customer : customerList){
            System.out.println(customer.showCustomerInfo());
        }
    }
}
