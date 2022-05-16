package constructor;
class C {
	double i=10.23;
	C (double j) {
		System.out.println("running class C constructor");
		i=j;
}
	public class cons5 {
		
	}
	public static void main(String[] args) {
		C c1= new C(15.8);
		System.out.println("global var i is:"+c1.i);

	}

}
