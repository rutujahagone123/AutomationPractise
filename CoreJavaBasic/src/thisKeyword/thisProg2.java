package thisKeyword;

public class thisProg2 {
 int age;
 float salary;
  thisProg2(int age, float salary) {
	  System.out.println("local age:"+age);
	  System.out.println("local salary:"+salary);
	 
	  //System.out.println("local age:"+age);
	  //System.out.println("local salary:"+salary);
  }
	  void display() {
		  System.out.println(age +" " +salary);
  }
	public static void main(String[] args) {
		thisProg2 t1= new thisProg2(34,456.7f);
		t1.display();
	 System.out.println("access global variable using this keyword is:"+t1.age);
	 

	}

}
