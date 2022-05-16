package constructor;

public class cons2 {
	int roll;
	double salary;
	cons2(int r, double s) {
		roll=r;salary=s;
	}
	void display() {
		System.out.println(roll+" "+salary);
	}

	public static void main(String[] args) {
		cons2 c1=new cons2( 12,34.65);
		c1.display();
		cons2 c2= new cons2(201,5505.45);
		c2.display();
				

	}

}
