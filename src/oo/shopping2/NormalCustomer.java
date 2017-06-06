package oo.shopping2;

public abstract class NormalCustomer {
	int price;
	float total;
	float discount = 0.9f;
	float returnMoney = 0.05f;
	public abstract void pay(int price) ;

		
}
