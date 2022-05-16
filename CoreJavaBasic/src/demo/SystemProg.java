package demo;

public class SystemProg {

	public static void main(String[] args) {
		//checking specific property
		System.out.println("system user dir:"+System.getProperty("user.home"));
		System.out.println("current working dir:"+System.getProperty("user.dir"));
		System.exit(0);// will stop the execution after this line
		//clearing this property
		System.clearProperty("user.home");
		System.out.println(System.getProperty("user.home"));// it will show null
		//setting some property
	

	}

}
