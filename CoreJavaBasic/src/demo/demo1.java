package demo;

public class demo1 {
static int rollNum=456;
static boolean result;
double payment=4500.56;
char grade;
	public static void main(String[] args) {
		//access static and non static global variable
		System.out.println("SGV rollNum:"+rollNum);
		System.out.println("SGV result:"+result);
		demo1 band=new demo1();
		System.out.println("non-SGV payment:"+band.payment);
		System.out.println("non-SGV grade:"+band.grade);
		//update the value of static and non static global variable
		rollNum=890;
		result=true;
		
		band.payment=56000.67;
		band.grade='A';
		System.out.println("updated value of SGV, rollNum is:"+rollNum);
		System.out.println("updated value of SGV,rersult is:"+result);
		System.out.println("updated value of non-SGV,payment is:"+band.payment);
		System.out.println("updated value of non-SGV,grade is:"+band.grade);
		
		
		
		
		
		

	}

}
