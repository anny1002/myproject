package oo.abstraction;

public class Main {

	public static void main(String[] args) {//public表示其他的package也可以使用
		Car c = new Car("TOYOTA", 1800, "Altis", "sedan");
		c.setMilage(25000);
		float current = c.addMilage(80);// 後面要加和()裡的一樣屬性
		System.out.println("目前里程為:" + current);
		/*  int height;
		  Tree() {
		    System.out.println("Planting a seedling");
		    height = 0;
		  }
		  Tree(int i) {
		    System.out.println("Creating new Tree that is "
		      + i + " feet tall");
		    height = i;
		  }*/
		//建構子可以不只出現一次，差在()內的屬性，所以現在空白跟只有一個int都不能再使用。
		//ex:如果現在(int a)的話就不能再使用,(int i,m)就可以使用。
	}

}
