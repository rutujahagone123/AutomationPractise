package method;

public class method6 {
public static void main(String[]args) {
	method6 m1=new method6();
	m1.additionOfTwoNumbers(25,45);
	int res=m1.getAdditionOfTwoNumbers(35,45);
	System.out.println("addition of nos is:"+res);
	int total=res+50;
	System.out.println("total is:"+total);
}
 public void additionOfTwoNumbers(int p,int t) {
	 int rt=p*t;
	 System.out.println("addition result is:"+rt);
}
public int getAdditionOfTwoNumbers(int p, int t) {
	int wq=p*t;
	return wq;
}
}