package oo.shopping;

public class GoldenCustomer extends Customer{
	public GoldenCustomer(){
		
	}
/*	public GoldenCustomer(int price){
	     this.price =price;
	}*/
	public GoldenCustomer(int price){
	     super(price);
	}
	public void pay(int price) {
		total = price - (price * discount);
		System.out.println("應付金額:"+total);
	}     

	public void moneyBack(int price) {
		total = price * returnMoney;
		System.out.println("回饋金:" + total);
	}


	public void print() {
		System.out.println("會員:金級"+"\t"+"消費金額:"+price+"\t"+"應付金額:" + (price*discount)+"\t"+ "回饋金:"+(price*returnMoney));
	}
}
