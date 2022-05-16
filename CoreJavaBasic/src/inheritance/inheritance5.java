package inheritance;
 class grandfather {
	 grandfather() {
		 System.out.println("i am const of grandfather");
	 }
	 void myHome() {
		 System.out.println("i am home of grandfather");
	 }
 }
 class father extends grandfather {
	 father(double d) {
		 super();
		 System.out.println(" i am const of father ");
	 }
	 void myPet() {
		 System.out.println("my pet is chiki ");
	 }
 }
 class child1 extends father {
	 child1(int a) {
		 super(23.34);
		 System.out.println("i am const of child1");
	 }
	 void Display() {
		 System.out.println("display of method");
	 }
 public static void main (String args[]) {
	 child1 c1= new child1(24);
	 c1.myHome();
	 c1.myPet();
	 c1.Display();
 //creating object of child most class and referred by parent
  father f2= new child1(21); //father f1= c1; ---home,myPet but display will not be visible to father
  	f2.myHome();
  	f2.myPet();
  	//creating object of child most class and referred by parent
  	grandfather g1= c1;// grandfather g2=new child(20);----home but myPet and display will not visible to grandfather
  	g1.myHome();
  	//creating object of child most class and referred by parent
  	grandfather g2= new father(45.56);//home but myPet and display will not visible to father
  	g2.myHome();
    }
 }