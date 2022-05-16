package simpleprintprograms;

public class GlobalVariable5 {
//Global variable
	static int empID=123;
	public static void main(String[] args) {
		int age=30,empID=800;//local variable
		System.out.println("local variable,age:"+age);//30
		age=45;
		System.out.println("updated,local variable,age:" +age);//45
		System.out.println("local variable,empID:"+empID);//800
		System.out.println("Standard way to access SGV,empID:"+GlobalVariable5.empID);//123
		empID=456;//updating local variable value
		System.out.println("updaed,local variable,empID:"+empID);//456
		GlobalVariable5.empID=789;//updating SGV value
		System.out.println("updated,SGV,empID:"+GlobalVariable5.empID);//789

	}

}
