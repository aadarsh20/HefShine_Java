
package javaCodes;

public class VowelConsonant {

	public static void main(String[] args) {
		
//		char ch='U';
//		if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'|| ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' ) {
//			System.out.println("Character is vowel");
//		}
//		else
//		{
//			System.out.println("Character is consonant");
//		}
		char ch=1;
		if(ch>='a' && ch<='z')
			System.out.println("lowerCase");
		else if(ch>='A' && ch<='Z')
			System.out.println("upperCase");
		else if(ch>=1 && ch<=9)
			System.out.println("number");
		else 
			System.out.println("symbol");

	}

}
