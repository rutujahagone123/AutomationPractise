package conditions;

public class ifcondition3 {

	public static void main(String[] args) {
int year=2021;
if((year%4==0)&& (year%100==0)||(year%100==0)) {
	System.out.println("leap year");
} else {
	System.out.println("not leap year");
}
ifcondition3.checkLeapYear(2023);
}
static boolean checkLeapYear(int year) {
	if((year%4==0)&&(year%100==0||(year%100==0))) 
		System.out.println("leap year");
		return true;
		}
{
	System.out.println("common year");
}
}
