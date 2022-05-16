package inheritance;
 class A {
	static int a=10;
	 int b=20;
	 double c=13.45; 
 }
 class B extends A {
	 static int x= 30;
	 int y=40;
	 double z=53.45;
 }
 class C extends B{
	  static int p=50;
	  int q=60;
	double r=66.45;
 }
public class inheritance1 {

	public static void main(String[] args) {
	System.out.println("access static members of class A :"+A.a);
	System.out.println("access static members of class B:"+B.a);
System.out.println("access static numbers of class C :"+C.a);
System.out.println("----------------------");
 C obj=new C();//it will have all properties of A, B as well as its own 
System.out.println("access non static members of class A:"+obj.b);
System.out.println("non static members of class A:"+obj.c);
System.out.println("non static members of class B:"+obj.y+  " " +obj.z);
System.out.println("non static members of class C :"+obj.q + " "+obj.r);
	}

}
