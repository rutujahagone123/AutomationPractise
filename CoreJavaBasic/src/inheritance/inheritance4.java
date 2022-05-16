package inheritance;
						// hierarchical inheritance
 class vehicle {
	 public void types() {
		 System.out.println("types of vehicles");
	 }
 }
 // child one inherits parent
  class car1 extends vehicle {
	  public void brand() {
		  System.out.println(" i am car and name is audi");
     }
}
  //child 2 inherits parent 
  class bike extends vehicle {
	  public void company() {
		  System.out.println(" company is hero");
	  }
  }
  //child 3 inherits parent class vehicle
  class scooter extends vehicle {
	  public void wheels( ) {
		  System.out.println("i have 2 wheels");
	  }
  }
public class inheritance4 {

	public static void main(String[] args) {
		scooter sc1= new scooter();
		sc1.wheels();
		sc1.types();
		bike b1= new bike();
		b1.company();
		b1.types();
		car1 c1= new car1();
		c1.brand();
		c1.types();

	}

}
