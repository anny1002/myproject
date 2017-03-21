package oo.abstraction;

public class CarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car("TOYOTA", 1800, "Altis", "sedan");
		// c1.brand="toyota";
		// c1.cc=1800;
		// c1.name="Altis";
		// c1.type="sedan";
		Car c2 = new Car("HONDA", 2000, "ACCORD", "");
		Car c3 = new Car("TOYOTA", 2000, "WISH", "");
		int[] n = new int[5];
		System.out.println(n[2]);
		// https://www.smart2help.com/e-books/tij-3rd-edition/的array
		// 不需初始化的值,自動設置
		Car[] cars = new Car[3];
		System.out.println(cars[0]);
		// 出來會是null
		// System.out.println(cars[0].name);
		// 會出錯
		cars[0] = new Car("TOYOTA", 1800, "Altis", "sedan");
		cars[1] = new Car("HONDA", 2000, "ACCORD", "");
		cars[2] = new Car("TOYOTA", 2000, "WISH", "");
		cars[0].id=300;
		cars[1].id=400;
		cars[2].id=500;
		System.out.println(cars[0].name);
		int i=0;
		//要先設i,不然出了迴圈i就不在了
		for (i=0;i<3;i++){
			System.out.println(cars[i].name);
		}
		System.out.println(i);
	}

}
