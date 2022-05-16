package loops;

public class switchCase3 {

	public static void main(String[] args) {
		char ch= 'i';
		switch(ch) {
		case 'a': 
			System.out.println("'a' is vowel");
			break;
		case 'c':
			System.out.println("'c' is not vowel");
			break;
		case 'e':
			System.out.println("'e' is a vowel");
			break;
		case 'i':
			System.out.println("'i' is vowel");
			break;
			default :
			System.out.println("not matched to the ch");
			break;
		}
		System.out.println("vowels ct:"+switchCase3.checkVowelct('a','z'));
	}
	public static int checkVowelct(char start, char ends) {
	int ct=0;
	for( char c1=start; c1<=ends;c1++) {
		if(c1 =='a'|| c1=='e' || c1=='i' || c1=='o' || c1=='u'); {
			ct=ct+1;
		}
	}
	return ct;
	}
	
}

