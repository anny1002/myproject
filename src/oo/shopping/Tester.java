package oo.shopping;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Customer c1 = new Customer();	
	    SilverCustomer c2 = new SilverCustomer();
	    GoldenCustomer c3 = new GoldenCustomer();
		Scanner scanner = new Scanner(System.in);
		for(int i =0;i<5;i++){System.out.println("請輸入金額:");
		String a=scanner.nextLine();
		int p=Integer.parseInt(a);
		System.out.println("請輸入級別(數字1-3):");
		System.out.println("1.一般客戶2.銀級客戶3.金級客戶");
		String b=scanner.nextLine();
		int number=Integer.parseInt(b);
		if (number==1){
			c1.pay(p);
			c1.moneyback(p);
		};
		if (number==2){
			c2.pay(p);
			c2.moneyback(p);
		};
		if (number==3){
			c3.pay(p);
			c3.moneyback(p);
		};}
		ArrayList<Customer> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		for(int j=0;j<list.size();j++){
			Customer money=list.get(j);
			}
	}

}
