package constructor;
 class A {
 int i;
 A() {
	 System.out.println("const of class A");
	 i=10;
 }
 void display() {
	 System.out.println("display of class A");
 }
 }
 class B {
	 float j= 23.4f;
	 B() {
		 System.out.println("const of class B");
	 }
 }
public class cons3 {
	void display() {
		System.out.println("display of cons3");
	}
public static void main(String[] args) {
	cons3 c1= new cons3();
	c1.display();
	A a1= new A();
	a1.display();
	System.out.println("global variable of A is:"+a1.i);
	B b1= new B();
	System.out.println("global var j is:"+b1.j);
	
	}
}
 
