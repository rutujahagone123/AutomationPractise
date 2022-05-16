package demo;

public class demo4 {
	public static void printDetails(int age, double salary) {
		System.out.println("my age is " + age + " years old");
		System.out.println("and " + salary + " is my salary");
	}

	public static void main(String[] args) {
		printDetails(25, 56000);
		demo4.printDetails(30, 45000);
		System.out.println("addition of nos:" + getAdditionResult(50, 50));
		double sum = getAdditionResult(25, 50);
		System.out.println("total is:" + sum);
		System.out.println("interest is:" + demo4.getInterest(12, 4000, 5));
		System.out.println("interest of interest1:" + demo4.getInterest1(24, 45000, 56));
		getInterest2(34, 4555, 67);
		getaddition(35, 35);
		demo4.getaddition(105, 234);
		// create reference
		demo4 d1 = new demo4();
		d1.getAdd(123, 345);

	}

	public static double getAdditionResult(double num1, double num2) {
		System.out.println("number 1 is:" + num1);
		System.out.println("number 2 is:" + num2);
		double result = num1 + num2;
		return result;

	}

	public static double getInterest(int p, double r, int t) {
		return (p * r * t) / 100;
	}

	public static double getInterest1(int p, double r, int t) {
		double result = (p * r * t) / 100;
		return result;
	}

	public static void getInterest2(int p, double r, int t) {
		double result = (p * r * t) / 100;
		System.out.println("interest is:" + result);
	}

	static void getaddition(double num1, double num2) {
		double result = num1 + num2;
		System.out.println("result is:" + result);
	}

	public void getAdd(int a, int b) {
		int res = a + b;
		System.out.println("addition of num is:" + res);
	}
}
