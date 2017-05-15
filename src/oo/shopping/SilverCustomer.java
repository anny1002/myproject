package oo.shopping;

public class SilverCustomer extends Customer {
	public void pay(int price) {
		total = price - (price * discount);
		System.out.println("應付金額:"+total);
	}

	public void moneyback(int price) {
		total = price * 0;
		System.out.println("回饋金:" + total);
	}
}
