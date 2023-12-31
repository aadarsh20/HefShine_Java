package javaCodes;

import java.util.Scanner;

public class SumofNumber {

	public static void main(String[] args) {
		
		int num=123;
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
		
		
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a no : ");
//		int num=sc.nextInt();
//		int sum=0;
//		while(num>0)
//		{
//			int rem=num%10;
//			//System.out.println("Number is : ");
//			//System.out.println(rem);
//			sum=sum+rem;
//			num=num/10;
//		}
//		System.out.println("Addition of number is : "+sum);

	}

}
