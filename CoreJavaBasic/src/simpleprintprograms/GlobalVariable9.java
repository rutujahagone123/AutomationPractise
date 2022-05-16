package simpleprintprograms;

public class GlobalVariable9 {
int empID=123;//non-SGV
	public static void main(String[] args) {
	GlobalVariable9 g1;
    g1=new GlobalVariable9();
    System.out.println("non-SGV empID with g1 ref:"+g1.empID);
    g1.empID=456;//updating non-SGV value
    System.out.println("updated non-SGV,empID with g1 ref:"+g1.empID);

//creating again new instance
    GlobalVariable9 g2=new GlobalVariable9();
    System.out.println("non-SGV empID with g2ref:"+g2.empID);
    System.out.println("program ends");
	}

}
