package overloading;

public class overloading3 {
public int myMethod(int num1,int num2) {
	System.out.println("first method called:");
	return num1+num2;
}
public int myMethod1(int var1, int var2) {
	System.out.println("second method called:");
	return var1+var2;
}
	public static void main(String[] args) {
		overloading3 o1=new overloading3();
		o1.myMethod(10,20);
		o1.myMethod(20,30);

	}

}
