package predefinedClasses;

public class stringClass1 {

	public static void main(String[] args) {
		String str1="DhanoriPune";
		char c= str1.charAt(0);
		System.out.println();

	}
 static String reverseString(String str) {
	 String temp="";
	 for(int i=str.length()-1;i>=0;i--) {
		 temp= temp + str.charAt(0);
	 }
	 return temp;
 }
 
}
