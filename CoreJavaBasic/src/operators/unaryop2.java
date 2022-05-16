package operators;

public class unaryop2 {

	public static void main(String[] args) {
		int  a= 0, b;
		b= a++ + ++a + ++a + a;
		// 0 + 2 + 3 + 3
		// 1
		System.out.println("a:"+a);//3
		System.out.println("b:"+b);//8
		System.out.println("----------------------");
		 a= -5;
		 b= a-- + --a + --a +a;
		 // -5 + -7 + -8 + -8
		 // -6
		 System.out.println("a:"+a);//
		 System.out.println("b:"+b);//
		System.out.println("----------------------");
		a= 21;
		b= --a + --a + --a + a + ++a + a++;
		//20 + 19 + 18 + 18 + 19 + 19
		System.out.println("a:"+a);//20
		System.out.println("b:"+b);//
		System.out.println("------------------------");
		a= -2;
		b= a-- + a + ++a + a++ + ++a + a++ + a;
		// -2 + -1 + -2 + -2 + -2 + -2 + 1
		System.out.println("a:"+a);// 1
		System.out.println("b:"+b);//-8

	}

}
