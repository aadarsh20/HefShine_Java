package javaCodes;

public class PellNumber {

	public static void main(String[] args) {
		// PELL NUMBER IS A MULTIPLE PREVIOUS NUMBER*2 AND 2ND PREVIOUS NUMBER
		
		
		 int a=0;
		// System.out.println(a);
		 int b=1;
		// System.out.println(b);
		 for(int i=0;i<=13;i++)
		 {
			 int c=b*2+a;
			 System.out.println(c);
			 a=b;
			 b=c;
		 }

	}

}
