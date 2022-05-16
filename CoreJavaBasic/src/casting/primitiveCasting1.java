package casting;

public class primitiveCasting1 {

	public static void main(String[] args) {
		int salary=30000;
		//explicit widening
		short sal=(short)salary;
		long lo=(long)salary;
		double sal1=(double)salary;
		System.out.println("short salary:"+sal+" \nlong salary:"+lo+" \ndouble salary:"+sal1);
		System.out.println("-------------------------");
		//implicit widening
		double saldouble=salary;
		long salarylo=salary;
		float salfloat=salary;
		System.out.println("double salary:"+saldouble+" \nlong salary:"+salarylo+" \nfloat salary:"+salfloat);
		System.out.println("--------------------------------------------");
		//explicit narrowing
		double money =234000.675;
		float f1=(float)money;
		long l1=(long)money;
		int i1=(int)money;
		byte b1=(byte)money;
		System.out.println("float money:"+f1);
		System.out.println("long money:"+l1);
		System.out.println("int money:"+i1);
		System.out.println("byte money:"+b1);
		//implicit narrowing not possible

	}

}
