package array;

public class singleDimen1 {
	public static void main (String args[]) {
  /* int a[];
 a= new int[5]; */
 //OR
 int a[]= new int[5];//declaration and instantiation
  System.out.println(a[0]);
  System.out.println(a[1]);
  System.out.println(a[2]);
  System.out.println(a[3]);
  System.out.println(a[4]);
  a[0]=10;
  a[1]=20;
  a[2]=30;
  a[3]=40;
  a[4]=50;
  System.out.println("------------after initialization------------");
  
  System.out.println(a[0]);
  System.out.println(a[1]);
  System.out.println(a[2]);
  System.out.println(a[3]);
  System.out.println(a[4]);
   System.out.println("count the array numbers:"+a.length);
   //access elements
   System.out.println("value assigned to a[1] is:"+a[1]);
   
   System.out.println(a[4]);
   //using simple loop
   for( int i=0;i<a.length;i++) {
	   System.out.println(i);
   }
   //using for each loop
   for(int i:a) {
	   System.out.println(i);
   }
	}
}
