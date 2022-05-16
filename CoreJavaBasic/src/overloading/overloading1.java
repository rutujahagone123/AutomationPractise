package overloading;

public class overloading1 {
static double res;
static public void square(int c) {
	System.out.println("here is square of overloading:"+c);
}
public static float square(int c,float f) {
	System.out.println("here is second method:"+c+f);
	return c+f;
	
}
	public static void main(String[]args) {
		System.out.println("static res is:"+res);
		System.out.println("static result with standard id:"+overloading1.res);
		overloading1.square(200);
		overloading1.square(25,2.5f);
	}
}
	