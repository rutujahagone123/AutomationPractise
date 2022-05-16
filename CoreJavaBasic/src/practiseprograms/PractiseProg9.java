package practiseprograms;

public class PractiseProg9 {
int age=35;//non SGV
	public static void main(String[] args) {
		float height=2.1f;
		short code=345;
		System.out.println("local variable heigt:"+height);
		System.out.println("local variable code:"+code);
		code=789;
		System.out.println("updating local variable code:"+code);
		PractiseProg9 me;
	    me=new PractiseProg9();
		System.out.println("non SGV age:"+me.age);
		
		

	}

}
