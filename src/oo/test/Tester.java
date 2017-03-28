package oo.test;

import java.util.ArrayList;

import oo.abstraction.Car;

//要有加import就能用
public class Tester {

	public static void main(String[] args) {
		Car c = new Car("TOYOTA", 1800, "Altis", "sedan");
		ArrayList<String> a = new ArrayList();
		// 可以放異質(型)Heterogeneous
		// <>裡面放你限定的類別
		a.add("331");
		a.add("821");
		a.add("886");
		// a.add(123);
		// a.add(true);
		// set是改變
		System.out.println(a.size());
		a.add("554");
		System.out.println(a.size());
		a.set(2, "885");
		System.out.println(a);
		// int data=(int)a.get(0);
		String data = a.get(0);
		//本來需加要轉型的屬性，加入限定後就不需要
		/*本次開獎號為
		  331
		  821
		  886
		  554
		  讓使用者輸入發票號碼(長度不限)判斷尾數後3位是否中獎   類別Invoice*/
		
	}

}
