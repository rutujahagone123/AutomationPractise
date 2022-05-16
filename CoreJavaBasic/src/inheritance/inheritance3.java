package inheritance;
 class forewheeler {
	 //default constructor
	 public void wheel( ) {
		 System.out.println("i have 4 wheels");
	 }
 }
 //car inherits parent forewheeler
 class car extends forewheeler {
	 //default constructor with default super();
	 public void type() {
		 System.out.println("type is maruti");
	 }
 }
 // child class maruti inherits car
 class maruti extends car {
	 //default const with super();
	 public void colour( ) {
		 System.out.println("my colour is blue");
	 }
 }
public class inheritance3 {

	public static void main(String[] args) {
		maruti m1= new maruti();
		m1.wheel();
		m1.type();
		m1.colour();

	}

}
