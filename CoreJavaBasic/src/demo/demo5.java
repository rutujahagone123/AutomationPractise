package demo;
						//recall concepts program
public class demo5 {
	//global variables
	static int age=45,salary=45000;//static
	
	short empId=1234,pin=7890;//non-static
	
	public static void main(String[] args) {
		int roll=123,Id=45678;
		System.out.println("local variable roll is:"+roll);
		System.out.println("local variable Id is:"+Id);
		//access static members
		System.out.println("static var is :"+age);
		System.out.println("static var id is:"+Id);
		System.out.println("access static method:"+demo5.callNum(1034,2034));
		demo5.callNum(789,8907);
		//access non static members
		demo5 d1=new demo5();
		System.out.println("non static var is:"+d1.empId);
		System.out.println("non static var is:"+d1.pin);
		d1.getInfo(34,3.4);
		d1.getInfo(143,345);

	}
public static long callNum(int a, int b ) {
	long res=a+b;
	System.out.println("addition is:"+res );
	return res;
}
public static long callNum(short a, short c) {
	long add=a+c;
	System.out.println("Addition is:"+add);
	return add;
}
public double getInfo(double age,double weight) {
	System.out.println("age is:"+age);
	System.out.println("weight is:"+weight);
	double sum=age+weight;
	return sum;
}
public int getInfo(int p, int q ) {
	System.out.println(" addition result is:"+ p+q);
	int total= p+q;
	return total;
}
}
