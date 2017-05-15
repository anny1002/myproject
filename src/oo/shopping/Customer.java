package oo.shopping;

public class Customer {
	int price;
	float total;
	float discount = 0.1f;
	float returnMoney = 0.05f;

	public Customer(){}
	public void pay(int price) {
     total=price;
     System.out.println("應付金額:"+total);
	}
	public void moneyback(int price) {
	     total=price*0;
	     System.out.println("回饋金:"+total);
		}
	public void print() {
		System.out.println("1.一般客戶"+"應付金額:"+total+"回饋金:"+total);
	}

}
