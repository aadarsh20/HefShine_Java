package javaCodes;

import java.util.Scanner;

public class PrimeEvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no : ");
		int s1=sc.nextInt();
		System.out.println("What to do : ");
		System.out.println("Enter 1 ==> for Prime ");
		System.out.println("Enter 2 ==> for even ");
		System.out.println("Enter 3 ==> for odd ");
		System.out.println("Enter 4 ==> for exit ");
		int s2=sc.nextInt();
		
		//prime number
		while(true)
		{
			if(s2==1)
			{
				int cnt=0;
				for(int i=1;i<=s1;i++)
				{
					if(s1%i==0)
						cnt++;
				}
				if(cnt==2) {
					
					System.out.println(s1+" is a Prime number");
				System.out.println();
				}
				else
					System.out.println(s1+" not a prime number");
				}
			
			// even number
			else if(s2==2)
			{
				//System.out.println("enter starting point");
				//int num1=sc.nextInt();
				System.out.println("enter ending point");
				int num2=sc.nextInt();
				for(int i=1;i<=num2;i++)
				{
					if(i%2==0)
						System.out.println(i+" ==> even number");
				}
				System.out.println( );
				}
			
			//odd number
			else if(s2==3)
			{
//				System.out.println("enter starting point");
//				int num2=sc.nextInt();
				System.out.println("enter ending point");
				int num3=sc.nextInt();
			for(int j=1;j<=num3;j++)
			{
				    if(j%2!=0)
					System.out.println(j+ " ==> odd number");
			}
			}
			
			// exit
			else if(s2==4)
			{
				break;
			}
			else 
			{
				System.out.println("For above operatin enter a correct number");
			}
			}
		}
}
	

