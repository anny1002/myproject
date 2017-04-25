package oo.mid;

public class Ticket {
	int id;
	String name;
	float price;
//宣告兩個public method，一個為getter用來取得private varible，另一個則為setter用來設定private varible
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getPrice() {
		return price;
	}
}
