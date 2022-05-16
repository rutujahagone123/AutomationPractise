package practise;
									//METHOD PRACTISE
public class practise1 {
 public static int getInfo(int a, int b) {
	 System.out.println(a+b);
	 return a+b;
 }
	public static void main(String[] args) {
		practise1.getInfo(15,15);
		getInfo(30,30);
		practise1 p1=new practise1();
		p1.getId(123,34);
		p1.getHold(24,34);
		p1.getHold(24,34);
	    practise1.callMe(12,234.5);
		callMe(12,234.5);
		System.out.println("addition of two nos is:"+practise1.getInfo(45,45));
	}
public int getId(int num1, int num2) {
	System.out.println(num1*num2);
	int res=num1*num2;
	return res;
}
public void getHold(double a, double b) {

	System.out.println(a*b);
}
static void callMe(int p, double r) {
	System.out.println(p/r);
}
static public long getInfo(short a, short b) {
	int res=a+b;
	System.out.println(a+b);
	return res;
}
}
	