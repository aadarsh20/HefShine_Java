package homePractise;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3},{1,2,3},{1,2,3}};
		int b[][]= {{1,2,3},{1,2,3},{1,2,3}};
		int c[][]=new int[a.length][b.length]; 
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
			}
	}
		
		
		
//		for(int i=8;i<=50;i++)
//		{
//			int cnt=0;
//			for(int j=1;j<=i;j++)
//			{
//				if(i%j==0)
//					cnt++;
//			}
//			if(cnt==2)
//				System.out.println(i);
//}
		
		
		
//		int num=9;
//		int cnt=0;
//		for(int i=1;i<=num;i++)
//		{
//			if(i*i==num)
//				cnt++;
//		}
//		if(cnt>0)
//		System.out.println("perfect");
//		else
//			System.out.println("not");
//		
		
		
//		int num=220;
//		int temp=num;
//		int sum=0;
//		while(num>0)
//		{
//			int rem=num%10;
//			sum=sum+rem;
//			num=num/10;
//		}
//		//System.out.println(sum);
//		if(temp%sum==0)
//		{
//			System.out.println(temp+" harshad number");
//		}
//		else
//		{
//			System.out.println(temp+" not a harshad number");
//		}
		
		
	
		
		
		
		
		
		
		
//		pell series
		
//		int a=0;
//		System.out.println(a);
//		int b=1;
//		System.out.println(b);
//		for(int i=0;i<=10;i++)
//		{
//			int c=b*2+a;
//			System.out.println(c);
//			a=b;
//			b=c;
//		}
		
		
		
		
		
		
		
		
		
//		int add;
//		for(int i=1;i<=5;i++){
//			for(int j=1;j<=5;j++)
//			{
//				System.out.print('*');	
//			}
//			add--;
//			System.out.println();
//		}
		
		
		
		
		
		
		
		
//		power of number
		
//		System.out.println(Math.pow(2, 3));
//		
//		int base=2;
//		int power=3;
//		int sum=1;
//		for(int i=1;i<=power;i++) 
//		{
//			sum=base*sum;
//		}
//		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
//		fibonaci series
		
//		int a=0;
//		System.out.println(a);
//		int b=1;
//		for(int i=0;i<=10;i++)
//		{
//			int c=a+b;
//			System.out.println(c);
//			a=b;
//			b=c;
//		}
		
		
		
		
		
		
		
		
		//addition of number enter number
		
//		int num=362;
//		int sum=0;
//		while(num>0)
//		{
//			int rem=num%10;
//			sum=sum+rem;
//			num=num/10;
//		}
//		System.out.println(sum);
		
		
		// addition of number using scanner
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a no : ");
//		int num=sc.nextInt();
//		int sum=0;
//		while(num>0)
//		{
//			int rem=num%10;
//			sum=sum+rem;
//			num=num/10;
//		}
//		System.out.println(sum);
		
		
		
		
		
		
		// Count no of digit
		
//		int num=23467;
//		int cnt=0;
//		while(num>0)
//		{
//			int rem=num%10;
//			cnt++;
//			num=num/10;
//		}
//		System.out.println(cnt);
//		
		
		// count number from user
//		 Scanner sc=new Scanner(System.in);
//		 System.out.println("Enter no for count");
//		 int num=sc.nextInt();
//		 int cnt=0;
//		 while(num>0)
//		 {
//			 int rem=num%10;
//			 cnt++;
//			 num=num/10;
//		 }
//		 System.out.println(cnt);
		
		
		
		
		
		
		
		//Fact
//		int fact=1;
//		int num=3;
//		for(int i=1;i<=num;++i)
//		{
//			fact=fact*i;
//		}
//		System.out.println(fact);

	}
