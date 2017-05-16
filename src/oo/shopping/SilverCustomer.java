package oo.shopping;

public class SilverCustomer extends Customer {
	public SilverCustomer(){
		
	}
	public SilverCustomer(int price){
	     this.price =price;
	}
	public void pay(int price) {
		total = price - (price * discount);
		System.out.println("應付金額:"+total);
	}

	public void moneyBack(int price) {
		total = price * 0;
		System.out.println("回饋金:" + total);
	}
	public void print() {
		System.out.println("會員:銀級"+"\t"+"消費金額:"+price+"應付金額:" + (price*discount)+ "回饋金:"+(price*0));
	}
}
