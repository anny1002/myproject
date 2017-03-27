package oo.abstraction;

public class PhoneTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p1 = new Phone(4.7f, "Apple",
				"12MP (million pixels) iSight shooter,3D touch technology,Live Photos feature",
				"Rose Gold",
				"iphone 6s");
        Phone p2= new Phone(5.1f,"Samsung","","gold","galaxy s7");
        Phone p3=new Phone(5.2f,"Htc","","red","htc 10");
        Phone [] phone=new Phone[10];
        phone[0]=new Phone(4.7f, "Apple",
				"12MP (million pixels) iSight shooter,3D touch technology,Live Photos feature",
				"Rose Gold",
				"iphone 6s");
        phone[1]=new Phone(5.1f,"Samsung","","gold","galaxy s7");
        phone[2]=new Phone(5.2f,"Htc","","red","htc 10");
        System.out.println(phone[0].color);
        int i=0;
        for (i=0;i<=2;i++){
        	System.out.println(phone[i].size);
        }
	}

}
