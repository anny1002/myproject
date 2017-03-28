package oo.abstraction;

public class Main {

	public static void main(String[] args) {//public表示其他的package也可以使用
		Car c = new Car("TOYOTA", 1800, "Altis", "sedan");
		c.setMilage(25000);
		float current = c.addMilage(80);// 後面要加和()裡的一樣屬性
		System.out.println("目前里程為:" + current);
	}

}
