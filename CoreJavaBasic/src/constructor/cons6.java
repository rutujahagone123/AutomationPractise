package constructor;

public class cons6 {
	cons6(int a) {
		System.out.println("int value is:"+a);
	}
	cons6(float c, float b) {
		System.out.println("value of c is:"+c );
		System.out.println("value of b is:"+b);
	}

	public static void main(String[] args) {
		cons6 c1= new cons6(34);
		cons6 c2= new cons6(23.1f,45.78f);
		}

	}


