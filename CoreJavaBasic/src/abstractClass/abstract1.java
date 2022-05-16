package abstractClass;
 abstract class bike1 {
	 abstract void run();
	 void speed(int spd) {
		 System.out.println("my speed is:"+spd);
	 }
 }
 class Honda extends bike1 {
	 void run() {
		 System.out.println("run safely");
	 }
	 void speed(int spd) {
			 System.out.println("Honda speed is:"+spd);
			 super.speed(120);
		 }
	void colour( ) {
	System.out.println("colour is blue");
		 
	 }
 }
public class abstract1 {

	public static void main(String[] args) {
		Honda h1=new Honda();
		h1.run();
		h1.speed(120);
		h1.colour();
		bike1 b1=new Honda();
		b1.run();
		b1.speed(100);
		

	}

}
