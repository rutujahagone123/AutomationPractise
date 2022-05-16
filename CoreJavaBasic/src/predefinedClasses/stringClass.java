package predefinedClasses;

public class stringClass {

	public static void main(String[] args) {
	stringClass sc= new stringClass();//string representation
	System.out.println("sc:"+sc);//output
	//creating object of string class
	//1. using literal
	String s1= "mumbai";
	String s2="mumbai";
	String s3= "banglore";
	System.out.println("s1:"+s1);
	System.out.println("s2:"+s2);
	System.out.println("s3:"+s3);
	System.out.println("char count of s1:"+s1.length());
	System.out.println("char coutn of s2:"+s2.length());
	System.out.println("char count of s3:"+s3.length());
	System.out.println("s1 & s2 using equals():"+ s1.equals(s2));
	System.out.println("s1 & s2 using == operator:"+(s1==s2));
	System.out.println("s1 & s2 using equals():"+s1.equals(s3));
	System.out.println("s1 & s2 using ==:"+(s1==s3));
	//way 2: object create by new keyword
	String s4=new String("mumbai");// will create two objects----> 1. constant pool & 2. non-constant pool
	System.out.println("s4:"+s4);
	System.out.println("s1 & s4 using equals():"+s1.equals(s4));
	System.out.println("s1 & s4 using ==:"+(s1==s4));
	String s5=new String("banglore");
	System.out.println("s1 & s5 using equals():"+s1.equals(s5));
	System.out.println("s1 & s5 using ==:"+(s1==s5));

	}

}
