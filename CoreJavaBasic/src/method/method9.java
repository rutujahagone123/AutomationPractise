package method;

public class method9 {

	public static void main(String[] args) {
	method9 m1=new method9();
	double res=m1.getInterest(4000,4.5,50);
	System.out.println("interest is:"+res);
	System.out.println("interest is:"+m1.getInterest1(5000,5.6,60));
	m1.getInterest2(7000,6.7,70);

	}
public double getInterest(int p, double r,int t) {
	return (p*r*t)/100;
}
// Or
private double getInterest1(int p, double r,int t) {
	double res=(p*r*t)/100;
	return res;
}
//or
void getInterest2(int p, double r,int t) {
	double res=(p*r*t)/100;
	System.out.println("interest is:"+res);
}
}
