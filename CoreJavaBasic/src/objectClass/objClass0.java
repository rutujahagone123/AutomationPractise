package objectClass;
 class city {
	 void display() {
		 System.out.println("i am amravati");
	 }
 }
public class objClass0 extends city {
	objClass0() {
		System.out.println("i am constructor");
	}
		void displayit() {
	    System.out.println("i am karajgaon");
	}

	public static void main(String[] args) {
		objClass0 ob= new objClass0();//instance
		System.out.println(ob);
		System.out.println(ob.toString());
		System.out.println(ob.hashCode());// will give code
		ob.displayit();
		city c1= new city();//instance
		c1.display();
		System.out.println(c1);
		System.out.println(c1.toString());
		System.out.println(c1.hashCode());
		city c2= new objClass0();
		System.out.println(c2);
		

	}

}

