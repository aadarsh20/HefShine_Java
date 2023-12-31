package javaCodes;

import java.util.Scanner;

public class PalondromeNumber {

	public static void main(String[] args) {
//		int num=1211;
//		int tempNum=num;
//		int revNum=0;
//		while(num>0)
//		{
//			int rem=num%10;
//			revNum=revNum*10+rem;
//			num=num/10;
//		}
//		System.out.println(revNum);
//		if(revNum==tempNum)
//			System.out.println("Palindrome Number");
//		else
//			System.out.println("Not a Palindrome number");
		
		
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no : ");
		int num=sc.nextInt();
		int tempNum=num;
		int revNum=0;
		while(num>0)
		{
			int rem=num%10;
			revNum=revNum*10+rem;
			num=num/10;
		}
		//System.out.println(revNum);
		if(revNum==tempNum)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not a Palindrome number");
	}

}
