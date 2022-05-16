package method;

import practise.practise1;

public class method10 {

	public static void main(String[] args) {
		getAddition(15,20,25);
		System.out.println("-----------");
		getAddition(25,30,35);
	System.out.println("addition  of nos :"+method10.getAdd(45,45));
	getAdd1(2.3f,4.5f);
	practise1.getInfo(45,45);
	}
public static double getAddition(int a, int b,int c) {
	 double res= a + b + c;
	System.out.println("Addition of three numbers is:"+res);
	return res;
}
private static int getAdd(int a, int b) {
	return a+b;
}
static float getAdd1(float a, float b) {
	 float addition=a+b;
System.out.println("Addition is:"+addition);
return addition;
}
public static int getInfo(int a,int b) {
	int res=a+b;
	System.out.println(res);
	return res;
}
}
