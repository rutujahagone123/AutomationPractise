package simpleprintprograms;

public class GlobalVariable8 {
int empID=123;//non static global variable
	public static void main(String[] args) {
		System.out.println("Program starts");
		GlobalVariable8 g1;
		g1=new GlobalVariable8();//object created here
		System.out.println("non-static global variable,empID:"+g1.empID);
		g1.empID=456;//updating value
		System.out.println("updated non-SGV empID:"+g1.empID);//456
		System.out.println("program ends");
		

	}

}
