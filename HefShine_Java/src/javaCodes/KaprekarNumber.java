package javaCodes;

public class KaprekarNumber {

	public static void main(String[] args) {
		
		
//		int num=45;
//		
//		int sq=num*num;
//		
//		while(num>0)
//		{
//			
//		}
		
		
		
		
		
		
		
//		int num=457;
//		int tempNum=num;     //Make temporary number 
//		
//		// Square of num
//		int sqr=num*num;
//		int cnt=0;
//		
//		
//		// Count number
//		while(num>0)
//		{
//			num=num/10;
//			cnt++;   
//		}
//		//System.out.println(cnt);
//		// Divide it two parts
//		int div=(int)Math.pow(10, cnt);
//		int fpart=sqr/div;
//		int spart=sqr%div;
//		
//		
//		// Addition of that two number
//		int add=fpart+spart;
//		if(add==tempNum)
//		System.out.println("Number is Kaprekar number");
//		else
//			System.out.println("Number is not Kaprekar number");
//		

		
		
		
		int num=9;
		int temp=num;
		
		int sq=num*num;
		int cnt=0;
		
		while(num>0) 
		{
			num=num/10;
			cnt++;
		}
		
		int div=(int)Math.pow(10, cnt);
		
		int fpart=sq/div;
		int spart=sq%div;
		
		int add=fpart+spart;
		
		if(add==temp)
			System.out.println("kaprekar");
		else
			System.out.println("not");
		
		
		
		
		
		
		
		

	}

}
