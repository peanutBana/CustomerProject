package customer.project;
public class VIPCustomerOther extends Customer {
	private int agentID;
	double saleRatio;
	
	public VIPCustomerOther(int customerID, String customerName, int agentID){
		super(customerID, customerName);
	
		super.customerGrade = "VIP";
		super.bonusRatio = 0.03;
		this.saleRatio = 0.2;
		this.agentID = agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += (price * bonusRatio); //보너스 포인트 계산
		return price-(int)(price*saleRatio); //가격 리턴
	}
	
	@Override
	public String showCustomerInfo(){
		return customerName + "님의 등급: " + customerGrade + ", 보너스 포인트: " + bonusPoint + "점, 담당 상담원 번호 : " +  agentID ;  
	}

	public int getAgentID(){
		return agentID;
	}
}
