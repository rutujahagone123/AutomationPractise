package ifCondition;

public class ifCond {

	public static void main(String[] args) {
		int num1=54, num2= 80;
		if(num1 != num2) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	System.out.println("check if equal to or  not euqal to:"+ifCond.getcheck(24,78));
	}

  static boolean getcheck( int num1, int num2) {
	 if(num1 !=num2) {
	 return true;
	 }
	 else { 
		 return false;
	 }
 
 }
}
