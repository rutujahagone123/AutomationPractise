package thisKeyword;

public class thisprog1 {
 static int rollNum, result;
 int age;
	thisprog1(int age) {
		System.out.println("local variable age:"+age);
		System.out.println("global variable age:"+this.age);
	}
		void abc() {
			System.out.println("hello");
			
		this.abc();
		}
		
	public static void main(String[]args) {
		int rollNum= 65;
		//System.out.println("access local rollNum:"+rollNum);
		//System.out.println("access global rollNum:"+thisprog1.rollNum);
		//System.out.println("access global result:"+result);
		thisprog1 t1= new thisprog1(35);
		System.out.println("age is:"+t1.age);
		
		
	}
}
