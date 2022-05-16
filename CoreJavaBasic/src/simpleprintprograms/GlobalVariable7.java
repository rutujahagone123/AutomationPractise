package simpleprintprograms;

public class GlobalVariable7 {
//Global variable
	int empID=123;//non-static global variable or instance variable
	public static void main(String[] args) {
		System.out.println("Program starts");
		//create an instance/object of a class
		GlobalVariable7 g1;//object not created here
		g1=new GlobalVariable7();//object create here
		System.out.println("non-static global variable empID:"+g1.empID);
		System.out.println("Program ends");

	}

}
