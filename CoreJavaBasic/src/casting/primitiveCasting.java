package casting;

public class primitiveCasting {

	public static void main(String[] args) {
		int myInt=9;
		double myDouble= myInt;//implicit widening i.e automatic which is done by compiler--> double myDouble=(double)myInt
		double d= (double)myInt;//<---- explicit widening---written by us
		System.out.println(myInt);
		System.out.println(myDouble);
		System.out.println(d);
		float myFloat=(float)myInt;
		System.out.println(myFloat);
		short s=(short)myInt;
		System.out.println(s);
		long l=(long)myInt;
		System.out.println(l);
		double salary= 123400.456098709;//narrowing type casting ex.
		int sal=(int)salary;// explicit narrowing
		float f=(float)salary;
		short sht=(short)salary;
		System.out.println("actual salary:"+salary);
		System.out.println("int salary:"+sal);
		System.out.println("float salary:"+f);
		System.out.println("short salary:"+sht);
		

	}

}
