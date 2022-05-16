package practiseprograms;

public class PractiseProg5 {
//global variable
	int stud1=20;//non static
	static double salary=35000;//static
	public static void main(String[] args) {
 System.out.println("can execute salary:"+PractiseProg5.salary);
 PractiseProg5 p1=new PractiseProg5();
 System.out.println("non static var stud1 :"+p1.stud1);
	}

}
