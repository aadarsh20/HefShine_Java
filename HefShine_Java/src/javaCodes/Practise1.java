package javaCodes;

import java.util.Scanner;

public class Practise1 {

	public static void main(String[] args) {
	
		while(true)
		{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a no");
		int sum=0;
		int num=sc.nextInt();
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
		
		
		System.out.println("Enter Y for continue N for exit");
		String cy=sc.next();
		if(cy=="y")
		{
			continue;
		}
		else if(cy=="n")
		{
			break;
		}
		}
		
		
		
		
//		Scanner sc= new Scanner(System.in);
//		System.out.println("enter a no");
//		int num=sc.nextInt();
//		int cnt=0;
//		while(num>0)
//		{
//			int rem=num%10;
//			cnt++;
//			num=num/10;
//		}
//		System.out.println(cnt);
		
		
		
//		int end=1;
//		for(int i=1;i<=5;i++)
//		{
//			int cnt=1;
//			for(int j=1;j<=end;j++)
//			{
//				System.out.print(cnt);
//				cnt++;
//			}
//			System.out.println();
//			end++;
//		}
		
		
//		int num=121;
//		int revNum=0;
//		while(num>0)
//		{
//			int rem=num%10;
//			revNum=revNum*10+rem;
//			num=num/10;
//		}
//		System.out.println(revNum);
		
		
		
//		int num=99;
//		int temp=num;
//		int sq=num*num;
//		int cnt=0;
//		while(num>0)
//		{
//			num=num/10;
//			cnt++;
//		}
//		System.out.println(cnt);
//		
//		int pow=(int)Math.pow(10,cnt);
//		 int fpart=sq/pow;
//		 int spart=sq%pow;
//		  int add=fpart+spart;
//		  
//		  if(add==temp)
//			  System.out.println("kaprekar");
//		  else
//			  System.out.println("not");
		
		
		
		
//		int  num=123;
//		int revNum=0;
//		while(num>0)
//		{
//			int rem=num%10;
//			revNum=revNum*10+rem;
//			num=num/10;
//		}
//		System.out.println(revNum);
		
		
//		int base=2;
//		int power=4;
//		int sum=1;
//		for(int i=1;i<=power;i++)
//		{
//			sum=sum*base;
//		}
//		System.out.println(sum);
		
		
		
//		int num=45;
//		int temp=num;
//		int sq=num*num;
//		int cnt=0;
//		while(num>0)
//		{
//			num=num/10;
//			cnt++;
//		}
//		int pow=(int)Math.pow(10, cnt);
//		
//		int fpart=sq/pow;
//		int spart=sq%pow;
//		
//		int add=fpart+spart;
//		
//		if(add==temp)
//			System.out.println("kaprekar");
//		else
//			System.out.println("not kaprekar");
				
		
		
		
		
//	int num=23;
//	int temp=num;
//	System.out.println(temp);
//	int sum=0;
//	while(num>0)
//	{
//		int rem=num%10;
//		sum=sum+rem;
//		num=num/10;
//	}
//	//System.out.println(sum);
//	if(temp%sum==0)
//	{
//		System.out.println("Harshad number");
//	}
//	else
//		System.out.println("not a harshad number");
		
		
		
	
		
		
		
//		int a=0;
//		System.out.println(a);
//		int b=1;
//		System.out.println(b);
//		for(int i=3;i<=10;i++)
//		{
//			int c=a+b;
//			System.out.println(c);
//			a=b;
//			b=c;
//		}
		
		
		
		
	
		
		
		//short p=1;
		//short k=short (p+2);
//		int sum=0;
//		int num=268;
//		while(num>0) {
//			int rem=num%10;
//			sum=sum+rem;
//			num=num/10;
//		}
//		System.out.println(sum);
//		
//		
		
		
		
//		int num=5;
//		int fact=1;
//		for(int i=1;i<=num;i++)
//		{
//			fact=fact*i;
//			//num--;
//		}
//		System.out.println(fact);
		
		
		
//		System.out.println(-8>>1);
//		System.out.println('j'+'a'+'v'+'a');
////		System.out.println(30+7-2/9);
		//int num=false?10:20;
		  //System.out.println(num);
		/*int a=4;
				while(a>0)
				{
					System.out.println(a + " ");
					a--;
				}
		/*long num=123L;
		if(num>123)
		{
			System.out.println("dfjk");
		}
		else
			System.out.println("hf");
		/*for(int i=0;i<5;i++)
		{
			System.out.println("hello");
		}
	//	char A='A';
		//System.err.println((byte)(A)*3-4);
	/*	System.out.println(10*5+100*(25*11)/(25*10)*10+5+7%2);
		System.out.println(10*5+100*(25*11));
		System.out.println((25*10)*10-5+7%2);
		System.out.println(Integer.SIZE);
		System.out.println(-5<<1);*/
//		int num=3;
//		int fact=1;
//		for(int i=1;i<=num;++i)
//		{
//			fact*=i;
//		}
//		System.out.println(fact);
//		int num=(int)12.848;
//		float f1=(int)24.3223523f;
//		
//		System.out.println(num);
//		System.out.println(f1);

	}

}
