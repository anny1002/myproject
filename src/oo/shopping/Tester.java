package oo.shopping;


import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer(6000));
		list.add(new SilverCustomer(6000));
		list.add(new SilverCustomer(9000));
		list.add(new Customer(10000));
		list.add(new GoldenCustomer(600));
		list.add(new SilverCustomer(6400));
		list.add(new GoldenCustomer(8000));
//		for(int j=0;j<list.size();j++){
//			Customer money=list.get(j);
		for(Customer money:list){
			if (money instanceof SilverCustomer&&
					!(money instanceof GoldenCustomer)){
				System.out.print("*");
				SilverCustomer silver=(SilverCustomer) money;
			}
			money.print();
			}
		String[] array = {"aa","bb","cc"};
		for (String s : array){
			System.out.println(s);
		}
		for(int i=0; i<array.length; i++){
			String s = array[i];
			System.out.println(s);
		}
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
			c1.moneyBack(p);
		}else if (number==2){
			c2.pay(p);
			c2.moneyBack(p);
		}else if (number==3){
			c3.pay(p);
			c3.moneyBack(p);
		}else{
			System.out.println("輸入格式錯誤");
			break;
		};
}
	}

}
