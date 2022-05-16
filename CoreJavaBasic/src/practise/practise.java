package practise;
									//LOCAL & GLOBAL VARIABLE
public class practise {
//global variables
	static int age=45;
	 static long salary=3456;
	 //non static variables
	 long num= 123456789;
	 float f=123.45f;
	public static void main(String[] args) {
	//local variables
		int a=10;
		short b=1234;
		long c=444809;
		float d=12.23f;
		double e=123.45;
		char f='a';
		boolean g=true;
		System.out.println("the value of a is:"+a);
		System.out.println("value of short and long are:" +b+ ' ' +c);
		System.out.println("value of float and double is:"+d + ' ' +e);
		System.out.println("char f is:"+f);
		System.out.println("boolean is :"+g);
		System.out.println("static GV age is:"+practise.age);
		System.out.println("salary is :"+salary);
		/*creating instance for non static variables*/
		practise p1=new practise();
		System.out.println("non static GV num is:"+p1.num);
		System.out.println("non static variable:"+p1.f);
		age=50;
		p1.num=101234545;
		b=5678;
		System.out.println("updated value of age is:"+age);
		System.out.println("updated value of num is:"+p1.num);
		System.out.println("updated alue of b is:"+b);
		}

}
