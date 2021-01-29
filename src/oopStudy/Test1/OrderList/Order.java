package oopStudy.Test1.OrderList;

public class Order {
    String orderNum;
    String orderID;
    String orderDate;
    String orderName;
    String orderProductNum;
    String addr;

    void printOrder(){
        System.out.println("주문번호 : "+orderNum+"\n주문자 아이디 : "+orderID+"\n주문날짜 : "+orderDate
        +"\n주문자 이름 : "+orderName+"\n주문 상품 번호 : "+orderProductNum+"\n배송주소 : "+addr);
    }
}
