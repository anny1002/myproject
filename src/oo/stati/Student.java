package oo.stati;

public class Student {

	// 屬性(Fields,Instance Variable實例變數)
	// 先設屬性，假設有設Student1，上面給的成績值就是實例的變數
	int english;
	int math;
	int chinese;
	static int pass = 60;
	// static屬於類別變數
	public Student(){
		
	}
	static {
		System.out.println("STATIC!!!!!!!");
		// System.out.println(english);
		// 會出錯，因為會先執行，所以身上還沒有屬性
		System.out.println(pass);
		// 一樣是先執行的，同是static
	}

	// static這個方法會先被執行
	public Student(int english, int math, int chinese) {
		super();
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}

	public void print() {
		System.out.println(getScore(english) + "\t" + getScore(math) + "\t" + getScore(chinese));
	}

	protected String getScore(int score) {
		if (score < pass) {
			return String.valueOf(score) + "*";
		} else {
			return String.valueOf(score);
		}

	}
}
