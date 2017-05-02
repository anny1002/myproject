package oo.stati;

public class Tester {

	public static void main(String[] args) {
		Student stu1 = new Student(58, 98, 66);
		Student stu2 = new Student(67, 56, 77);
		stu1.pass = 70;
		stu1.print();
		stu2.print();
		// 本來的pass是60，加上static後只要改一個全都會變
		GraduateStudent gstu = new GraduateStudent(68, 77, 67);
		gstu.print();
	}

}
