package method;

public class method4 {

	public static void main(String[] args) {
		
System.out.println("addition of my number is:"+getMyNo(25,50));
System.out.println("addition of my 2nd no is:"+method4.getMyNo(45,45));

	}

public static int getMyNo(int no1,int no2) {
	System.out.println("My no1 is:"+no1);
	System.out.println("My no2 is:"+no2);
	int res=no1+no2;
	return res;
}
}