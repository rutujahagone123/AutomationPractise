package conditions;

public class ifcondition {

	public static void main(String[] args) {
 //variable declaration
	int num1=40,num2=50;
	if(num1==num2) {
		System.out.println("num1 is equal to num2");
	}
	else {
			System.out.println("num1 is either greater than or smaller than num2");
		}
	if(num1>num2) {
		System.out.println("num1 is greater than num2");
	}
	else {
		System.out.println("num1 is smaller than num2");
	}
	if(num1<=num2) {
		System.out.println("num1 is less than or eqyal to num2");
	}
	else {
		System.out.println("num1 is greater than num2");
	}
	if(num1!=num2) {
		System.out.println("num1 is greater than num2");
	}else {
		System.out.println("num1 is smaller than num2");
	} 
	if(num1==num2||num1<num2) {
	System.out.println("num1 is either equal to num2 or smaller than num2");	
	} 
	else {
		System.out.println("num1 is greater than num2");
	}
	if(num1<num2 && num1>num2) {
	System.out.println("num1 either less than num2 And num1 greater than num2");
	}
	else {
		System.out.println("num1 is smaller than num2");
	}
}
}

