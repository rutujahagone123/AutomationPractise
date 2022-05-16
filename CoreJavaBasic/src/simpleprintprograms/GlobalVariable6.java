package simpleprintprograms;

public class GlobalVariable6 {
//Global variable
	static int empID=123;
	public static void main(String[] args) {
		int age=30;//local variable
		System.out.println("local variable,age:"+age);//30
		age=45;
		System.out.println("updated,local variavle,age:"+age);//45
		System.out.println("Direct way to access SGV,empID:"+empID);//123
		System.out.println("Standard way to access SGV,empId:"+GlobalVariable6.empID);
		empID=456;
		System.out.println("updated,Direct way to access SGV,empID:"+empID);//456
		System.out.println("updated,Standard way to access,empID:"+GlobalVariable6.empID);//456

	}

}
