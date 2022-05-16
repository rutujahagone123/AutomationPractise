package method;

public class method3 {

	public static void main(String[] args) {
System.out.println("result of addition1:"+getAdditionResult(34.56,50));
System.out.println("++++++");
System.out.println("result of addition:"+method3.getAdditionResult(45.67,45));
System.out.println("++++++++++");
double sum=getAdditionResult(34.56,50);
System.out.println("sum of the nos is:"+sum);
System.out.println("++++++++++++++");
double finalResult=sum*100;
System.out.println("final result :"+finalResult);
	}
static double getAdditionResult(double num1, double num2) {
	System.out.println("Number 1 is:"+num1);
	System.out.println("Number 2 is:"+num2);
	double res= num1+num2;
	return res;
	}
}