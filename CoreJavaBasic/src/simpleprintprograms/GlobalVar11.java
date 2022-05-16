package simpleprintprograms;

public class GlobalVar11 {
//Global variable----> static & non-static global variable
	static int rollNum=456;
	static boolean result;
	
	double payment=4500.56;
	char grade;
	public static void main(String[] args) {
		System.out.println("program starts");
		//access static & non static global variable----->
		//static global variable
		System.out.println("SGV nollNum:"+rollNum);
		System.out.println("SGV result:"+result);
		//non-static global variable
		GlobalVar11 g1=new GlobalVar11();//----> creating object/instance
		//now access
		System.out.println("NonSGV payment:"+g1.payment);
		System.out.println("grade:"+g1.grade);
		//updating the values of both
		rollNum=890;
		result=true;
		g1.payment=23456;
		g1.grade='A';
		//access the updated values
		System.out.println("updated rollNum:"+rollNum);
		System.out.println("updated result:"+result);
		System.out.println("updated payment:"+g1.payment);
		System.out.println("updated grade:"+g1.grade);
		

	}

}
