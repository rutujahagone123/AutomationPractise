package array;

public class singleDimenArray {

	public static void main(String[] args) {
		String[] cars;
		cars=new String[4];
		//OR
		//String[] cars=new String[4];
		cars[0]=" volvo";
		cars[1]="BMW";
		cars[2]="ford";
		cars[3]="mazda";
		//Or 
		//String[] cars= {"volvo","BMW","ford","mazda"};
		//access the element of an array
		System.out.println(cars[0]);//"volvo"
		//change an array element
	    cars[0]="opel";
	    System.out.println(cars[0]);
	    //array element count
	    System.out.println(cars.length);//4
	    System.out.println("********simple for loop**************");
	    //iterating array elements using for loop
	    for( int i=0;i<cars.length;i++) {
	    	System.out.println(i);
	    }
	    System.out.println("---------------------for each loop----------------");
	    //iterate array elements using for each loop
	    for(String i: cars) {
	    	System.out.println(i);
	    }
	}

}
