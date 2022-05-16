package method;

public class method7 {

	public static void main(String[] args) { 
		method7 m1=new method7();
		m1.additionOfTwoNumbers(25,45);
		int res=m1.getAdditionOfTwoNumbers(25,45);
		System.out.println("result is:"+res);
		double total=res*100-58;
		System.out.println("total sum is :"+total);
		System.out.println("sum:"+m1.getAdditionOfTwoNumbers(25,45));
	}
public void additionOfTwoNumbers(int p,int t)
{
	int rt=p+t;
	System.out.println("Addition result is:"+rt);
}
public int getAdditionOfTwoNumbers(int p, int t) {
	int wq=p+t;
	return wq;
}
}