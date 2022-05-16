package constructor;

public class cons1 {
int roll=123;
double percent=34.45;
cons1(int r, int p) {
	System.out.println(r+" "+ p);
}
	public static void main(String[] args) {
		cons1 c1= new cons1(2,5);
		System.out.println("global var roll is:"+c1.roll);
		System.out.println("percent is:"+c1.percent);
	}

}
