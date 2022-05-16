package practise;
									//METHOD OVERLOADING
public class practise2 {

	public static void main(String[] args) {
		getCh(50,50);
		practise2.getCh(70,7000);
		practise2 p1=new practise2();
		p1.getAdd(25, 50);
		practise2 p2=new practise2();
		p2.getAdd(40,40.56f);

	}
public static int getCh(int a,int b) {
	System.out.println("addition of two numbers:"+a+b);
	return a+b;
}
static double getCh(int a,short b) {
	System.out.println("addition of numbers is:"+a+b);
	double res= a+b;
	return res; 
}
public int getAdd(int num1, int num2) {
	System.out.println("addition :"+ num1+num2);
	return num1+num2;
}
public float getAdd(int num1, float num2) {
	System.out.println(num1+num2);
	return num1+num2;
}
}
