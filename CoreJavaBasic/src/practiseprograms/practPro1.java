package practiseprograms;

public class practPro1 {
 static short s1= 1234;
 long l1= 45678;
	public static void main(String[] args) {
		int num=10;
 System.out.println("local var num is:"+num);
 System.out.println("static var is short type:"+s1);
 System.out.println("standard way is:"+ practPro1.s1);
 practPro1 pp= new practPro1();
 System.out.println("non static global var is:"+pp.l1);
 System.out.println(practPro1.getAdd(25,234));
 practPro1.getNum(890,90.765);
  double total= 345.90 * 234;
  System.out.println("total is:"+ total);
	}
public static int getAdd(int a, int b) {
	 int addition= a+b;
	 return addition;
}
public static double getNum(int p, double q) {
	 double sum= p+q;
	System.out.println("addition of num is:"+sum);
	return p + q;
}
}
