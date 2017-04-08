package oo.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<>();
		a.add(331);
		a.add(821);
		a.add(886);
		a.add(554);
		System.out.println("本次開獎號為");
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		System.out.println(a.get(3));
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入您的發票號碼:");
		String x = scanner.nextLine();
		int correct=Integer.parseInt(x);
		int three=correct%1000;
		if (three==a.get(0)||three==a.get(1)||three==a.get(2)||three==a.get(3)){
			System.out.println("恭喜您中200元");
		}
		
		
	}

}
