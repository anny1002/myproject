package oo.shopping;

public class Customer {
	int price;
	float total;
	float discount = 0.9f;
	float returnMoney = 0.05f;

	public Customer(){
		
	}
	public void pay(int price) {
     total=price;
     System.out.println("應付金額:"+total);
	}
	public void moneyBack(int price) {
	     total=price*0;
	     System.out.println("回饋金:"+total);
		}

	public Customer(int price){
	     this.price =price;
	}
	public void print() {
		System.out.println("會員:一般"+"\t"+"消費金額:"+price+"\t"+"應付金額:"+price+"\t"+ "回饋金:"+(price*0));
	}

}
