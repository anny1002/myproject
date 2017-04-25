package oo.mid;

public class MealTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Meal m1a=new Meal("1","薯條","紅茶",115);
Meal m1b=new Meal("1","沙拉","可樂",115);
Meal m2a=new Meal("2","薯條","牛奶",105);
Meal m2b=new Meal("2","沙拉","雪碧",105);
Meal m3a=new Meal("3","薯條","可樂",125);
Meal m6a=new Meal("6","薯條","玉米濃湯",95);
Meal[] meals=new Meal[20];
meals [0]=new Meal("1","薯條","紅茶",115);
meals [1]=new Meal("1","沙拉","可樂",115);
meals [2]=new Meal("2","薯條","牛奶",105);
meals [3]=new Meal("2","沙拉","雪碧",105);
meals [4]=new Meal("3","薯條","可樂",125);
meals [5]=new Meal("6","薯條","玉米濃湯",95);
int i=0;
for(i=0;i<6;i++){
	System.out.println(meals[i].money);
}
	}

}
