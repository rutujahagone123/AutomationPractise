package method;

public class method5 {

	public static void main(String[] args) {
		System.out.println("get interest using getInterest():"+getInterest(250000,6.5,60));
       System.out.println("get interest using getInterest1():"+method5.getInterest(250000,6.5,60));
       method5.getInterest(35000,6.7,56);
       }

public static double getInterest(int p,double r,int t) {
	//p=250000, r=6.5, t=60;
	 return (p*r*t)/100;
}
	//Or
	public static double getInterest1(int p,double r,int t) {
		//p=25000, r=6.5, t=60
		double res=(p*r*t)/100;
		return res;
	}
	//Or
	public static void getInterest2(int p,double r,int t) {
		//p=35000,r=6.7,t=56
		double res=(p*r*t)/100;
		System.out.println("Interest is :"+res);
	}
}
