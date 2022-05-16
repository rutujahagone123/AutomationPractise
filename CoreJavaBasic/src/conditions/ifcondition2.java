package conditions;

public class ifcondition2 {

	public static void main(String[] args) {
// variable declaration
		int num=53;
		//check if number is divisible by 2
		if(num%2==0) {
			System.out.println("even number");
		} else {
			System.out.println("odd number");
		}
	ifcondition2.checkEvenOddNum(80);
	ifcondition2.isEvenNum(100);
	}
public static void checkEvenOddNum(int num) {
	if(num%2==0) {
		System.out.println("number is even");
	} else {
		System.out.println("number is odd"); 
		}
	}
	static boolean isEvenNum(int num) {
		if(num%2==0) {
			System.out.println("true");
			return true;
			} else {
		System.out.println("false");
		return false;
	}
}
}
