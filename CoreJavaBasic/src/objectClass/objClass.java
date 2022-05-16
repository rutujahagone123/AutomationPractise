package objectClass;

public class objClass {
	static int roll_num=100;
	int roll;
	//constructor 
	objClass() {
		roll = roll_num;
		roll_num++;
	}
	@Override
	public String toString() {
		return "BasicCoreJava";
	}
  // driver code
	public static void main(String[] args) {
    objClass s=new objClass();
    // below are same statements we can write diff ways
    System.out.println(s.toString());// string representation of an object
    System.out.println(s);//------> s.toString(); -----> srting representation
     System.out.println(s.hashCode());
	}

}
