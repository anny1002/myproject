package oo.shopping;

public class SilverCustomer extends Customer {
	public SilverCustomer(){
		
	}
/*	public SilverCustomer(int price){
	     this.price =price;
	}*/
	public SilverCustomer(int price){
	     super(price);
	}//加super後不用再加空的建構子(Customer裡)
	public void pay(int price) {
		total = price - (price * discount);
		System.out.println("應付金額:"+total);
	}

	public void moneyBack(int price) {
		total = price * 0;
		System.out.println("回饋金:" + total);
	}
	public void print() {
		System.out.println("會員:銀級"+"\t"+"消費金額:"+price+"\t"+"應付金額:" + (price*discount)+"\t"+ "回饋金:"+(price*0));
	}
}
