package practiseprograms;

public class PractiseProg7 {
static int empID=123;

	public static void main(String[] args) {
int empID=345, age=35;
System.out.println("SGV empID:"+empID);
System.out.println("local variable age:"+age);
age=50;
System.out.println("updating the local variable age:"+age);
empID=456;
System.out.println("updating the SGV empID:"+empID);
System.out.println("local variable empID:"+empID);

	}

}
