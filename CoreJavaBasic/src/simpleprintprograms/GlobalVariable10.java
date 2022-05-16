package simpleprintprograms;

public class GlobalVariable10 {
//Global variable
	int empID=123;//non static
	static double salary;//static
	public static void main(String[] args) {
		System.out.println("****access Static global variable*****");
		System.out.println("SGV,salary:"+salary);//0.0
		System.out.println("with Standard way,SGV salary:"+GlobalVariable10.salary);//0.0
		System.out.println("*****access non-SGV*******");
		GlobalVariable10 v1=new GlobalVariable10();
		System.out.println("nonSGV empID:"+v1.empID);
		System.out.println("program ends");
		

	}

}
