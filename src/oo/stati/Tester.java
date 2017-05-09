package oo.stati;

import java.util.ArrayList;

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
		//
		ArrayList<Student> list=new ArrayList<>();
		list.add(new GraduateStudent(68, 77, 67));
		list.add(new GraduateStudent(57, 82, 12));
		list.add(new GraduateStudent(55, 64, 96));
		list.add(new GraduateStudent(19, 88, 67));
		list.add(new GraduateStudent(34, 82, 65));
		for (int i=0;i<list.size();i++){
			Student stu =list.get(i);
			stu.print();
		}
//		Student stu  =new Student();
//		System.out.println(stu);
//		如果沒有用toString方法，會出現stu的位置--->oo.stati.Student@15db9742
		Student stu  =new Student();
		System.out.println(stu);
	}

}
