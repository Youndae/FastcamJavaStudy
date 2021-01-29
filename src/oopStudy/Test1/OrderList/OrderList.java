package oopStudy.Test1.OrderList;

import java.text.SimpleDateFormat;

public class OrderList {
    public static void main(String[] args) {
        Order orderInfo = new Order();

        SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");

        orderInfo.orderNum = "201907210001";
        orderInfo.orderID = "abc123";
        orderInfo.orderDate = "2019년 7월 21일";
        orderInfo.orderName = "홍길순";
        orderInfo.orderProductNum = "PD0345-12";
        orderInfo.addr = "서울시 영등포구 여의도동 20번지";

        orderInfo.printOrder();


    }
}
