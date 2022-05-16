package operators;

public class unaryop {

	public static void main(String[] args) {
 int a=0, b;
  b= a++ + ++a + ++a + a;
  System.out.println("a is:"+a);
  System.out.println("b is:"+b);
  System.out.println("------------------------");
  a= -5;
  b= a-- + --a + --a + a;
  System.out.println("a is:"+a);// -8
  System.out.println("b is:"+b);// -28
   System.out.println("------------------------");
   a=21;
   b= --a + --a + --a + a + ++a + a++;
   System.out.println("a is:"+a);
   System.out.println("b is:"+b);
   
	}

}
