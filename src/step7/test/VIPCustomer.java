package step7.test;

public class VIPCustomer extends Customer {

    private int agentId;
    double saleRatio;

    public VIPCustomer(int customerId, String customerName, int agentId){
        super(customerId, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentId = agentId;
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }

    public String showCustomerInfo(){
        return super.showCustomerInfo() + "담당 상담원 번호는 " + agentId + " 입니다.";
    }

    public int getAgentId(){
        return agentId;
    }
}
