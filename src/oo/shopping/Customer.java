package oo.shopping;

public class Customer {
	int price;
	float discount = 0.1f;
	float returnMoney = 0.05f;
	String level1 = "一般客戶";
	String level2 = "銀級客戶";
	String level3 = "金級客戶";

	public Customer() {

	}

	public Customer(int price, float discount, float returnMoney) {
		this.price = price;
		this.discount = discount;
		this.returnMoney = returnMoney;
	}
}
