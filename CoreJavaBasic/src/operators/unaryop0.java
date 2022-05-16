package operators;

public class unaryop0 {

	public static void main(String[] args) {
		int a=47,b;
		b=a++;
		System.out.println(a);//48
		System.out.println(b);
		int x=a;
		int y=++x;
		System.out.println(x);//49
		System.out.println(y);
		
		
		
int p=-15,q=25, res;
		res= p++ + --q;
		//res= -15 + 24;
System.out.println("result:"+res);//9
System.out.println("p:"+p);//-15 +1= -14
System.out.println("q:"+q);//24
	}

}
