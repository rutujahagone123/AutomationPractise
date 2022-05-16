package simpleprintprograms;

public class GlobalVariable3 {
static int empID=123;
	public static void main(String[] args) {
		int empID=100,age=30;//local variable
		System.out.println("local variable,empID:"+empID);//100
		System.out.println("local variable,age:"+age);//30
		System.out.println("Standard way to access SGV,empID:"+GlobalVariable3.empID);//123
		

	}

}
