package casting;
 class grandpa {
	 void test1( ) {
		 System.out.println("running method test1");
	 }
 }
 class papa extends grandpa {
	 void test2() {
		 System.out.println("running test2");
	 }
 }
 class son extends papa {
	 void test3() {
		 System.out.println("running test3");
	 }
 }
public class nonPrimitive {

	public static void main(String[] args) {
		papa b1= new son();//implicit up casting---- java will convert as----papa b1=(papa) new son
		b1.test1();
		b1.test2();
		//b1.test3();// will hidden becz son has object created so that class member will hide
		son c2= new son();
		papa b4= c2;//implicit up casting ----java internally ----papa b4=c2--- new son()---(papa) new son();
		papa b2= (papa) c2;//explicit up casting ------papa b2=(papa)new son;
						//Or
		papa b3= (papa) new son();//explicit up casting
		b2.test1();
		b2.test2();
		grandpa a1= new son();
		papa a2=new son();
		papa x1= new papa();
		grandpa a3=x1;// grandpa a3=x1----new papa() ----(grandpa) new (papa);
		grandpa a4=(grandpa)x1;
		grandpa a5= (grandpa)new papa();
		
	}

}
