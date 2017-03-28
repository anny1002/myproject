package oo.abstraction;

public class Car {
	// 考試
	// which following is local variable?
	String brand;
	int cc;
	String name;
	String type;
	int id;
	int status;
	float milage;

	public Car(String brand, int cc, String name, String type) {
		this.brand = brand;
		this.cc = cc;
		this.name = name;
		this.type = type;
		// 裡面的紅brand....是local variable
	}

	public void xxxx() {
		// (不用回傳)，xxxx()是方法，void是回傳值
	}

	public void setMilage(int m) {
		milage = m;
	}// 方法第一個詞全是小寫，第二個詞再大寫

	public float addMilage(int m) {
		milage = milage + m;
		return milage;
	}//return milage的值

	public void maintain() {
		status = 5;
	}

}
