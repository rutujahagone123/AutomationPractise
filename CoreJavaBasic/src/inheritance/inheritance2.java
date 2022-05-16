package inheritance;

 //parent class
class fruit {
	fruit() {
		System.out.println("i am constructor of fruit");
	}
	public void taste() {
		System.out.println("fruits are sweet in taste");
	}
}
// child class apple inherits parent class fruit 
class apple extends fruit {
	apple() {
		// super(); // java will write default super()
		System.out.println("i am const of child class apple");
	}
	public void shape( ) {
		System.out.println(" apple is round in shape");
	}
}
public class inheritance2 {
	public static void main (String args[]) {
		apple a1= new apple();
		a1.taste();// method call of parent class
		a1.shape();//method call of child class
	}
}