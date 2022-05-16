package operators;

public class unaryop1 {

	public static void main(String[] args) {
		int a= 20, b;
		b= a++ + a-- + ++a - --a + a++ + ++a;
		//20 + 21 + 21 - 20 + 20 + 22 =116
		//21   20             21
		System.out.println("a:"+a);//22
		System.out.println("b:"+b);// 84
		System.out.println("---------------------------");
		
		
 int p= -25, q;
 q= --p + p-- - ++p + p++ - --p+ ++p;
 //  -24 + 24 - 24 + 24 - 24 + 25
 //       23        25
 System.out.println("p:"+p);//-25
 System.out.println("q:"+q);//-51
  System.out.println("------------------------");
  
  
  int  x=-10, y;
  y= x-- + ++x - --x + x++ - x++;
  // -10 + -10 - 9 + 9  - 10 
  // -9              10    11
  System.out.println("x:"+x);//-9
  System.out.println("y:"+y);//-10
  System.out.println("-----------------------");
   int r= -13,s;
   s= r++ + r-- + --r - --r + r++ - r--;
   // -13 + 12 + 10 - 9 + 9 - 10
   // -12  -11            10  9
   System.out.println("r:"+r);//-15
   System.out.println("s:"+s);//-25
	}

}
