package simpleprintprograms;

public class GlobalVariable4 {
//global variable
	static int empID=123;
	public static void main(String[] args) {
		int age=30;//local variable
		System.out.println("local variable age:"+age);//30
		System.out.println("Direct way to access SGV, empID:"+empID);//123
		System.out.println("Standard way to access SGV,empID:"+empID);//123
		
	}

}
