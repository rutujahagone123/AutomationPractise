package overloading;

public class overloading2 {

	public static void main(String[] args) {
	overloading2 o1=new overloading2();
	
	o1.display();
	o1.addNumbers();
	System.out.println("add numbers:"+o1.addNumbers(35,35));

	}
void display() {
	System.out.println("i am pune");
}
int addNumbers() {
System.out.println("addNumbers() started");
int num1=10,num2=20;
System.out.println("addNumbers() before return");
return num1+num2;
	}
int addNumbers(int num1,int num2) {
	System.out.println("addNumbers(int,int) started");
	System.out.println("addNumbers(int,int)before return");
	return num1+num2;
}
}
