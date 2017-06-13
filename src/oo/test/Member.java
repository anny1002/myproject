package oo.test;

public class Member {
	String id;
	private int age;
	String name;
	public Member (String name){
		System.out.println("member constructor");
	}
	public void setAge(int age){
	if(age<0){
		age=0;
	}	
	this.age=age;
	}
	public int getAge(){
		return age;
	}
	public Member (){
		
	}
	//找到適用抽象類別的例子
}
