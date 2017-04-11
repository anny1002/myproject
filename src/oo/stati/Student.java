package oo.stati;

public class Student {

	// 屬性(Fields,Instance Variable實例變數)
	// 先設屬性，假設有設Student1，上面給的成績值就是實例的變數
	int english;
	int math;
	int chinese;
	static int pass = 60;

	// static屬於類別變數
	public Student(int english, int math, int chinese) {
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}

	public void print() {
		System.out.println(getScore(english) + "\t" + getScore(math) + "\t" + getScore(chinese));
	}

	private String getScore(int score) {
		if (score < pass) {
			return String.valueOf(score) + "*";
		} else {
			return String.valueOf(score);
		}

	}
}
