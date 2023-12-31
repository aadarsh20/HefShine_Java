package javaCodes;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		 int base=2;
		 int power=4;
		 int sum=1;
		 for(int i=1;i<=power;i++)
		 {
			sum=sum*base; 
		 }
		 System.out.println(sum);
		
		
		
		
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println(Math.pow(2, 3));
//		System.out.println("Enter Base value : ");
//		int base=sc.nextInt();
//		
//		System.out.println("Enter Power value : ");
//		int power=sc.nextInt();
//		
//		int ans=1;
//		
//		for(int i=1;i<=power;i++)
//		{
//			ans=ans*base;
//		}
//		System.out.println("Power value of "+base+" is : "+ans);

	}

}
