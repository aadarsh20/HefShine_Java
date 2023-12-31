package homePractise;

import java.util.Arrays;
import java.util.Scanner;

public class LeetPract {

	public static void main(String[] args) {
		
		int a[]= {1,2,1,3,3};
		int b[]=new int[2];
        int index=0;
        for(int i=0;i<a.length;i++)
        {
            int cnt=1;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                cnt++;
            }
            if(cnt==2)
            b[index++]=a[i];
        }
        System.out.println(Arrays.toString(b));
	//	int a[]= {6,2,7,2,9,3};
		
		System.out.println(2^2+4^2);
		
//int a[]= {5,3,6,1,7,2,9};
//		
//		for(int i=0;i<a.length;i++)
//		{
//			int mid=i;
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[j]<a[mid])
//					mid=j;
//			}
//			int temp=a[i];
//			a[i]=a[mid];
//			a[mid]=temp;
//		}
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.print(a[i]+" ");
//		}
//		
//		int start=0;
//		int end=a.length-1;
//		int ele=6;
//		int cnt=0;
//		while(start<=end)
//		{
//			int mid=(start+end)/2;
//			if(a[mid]==ele)
//			{
//				cnt++;
//				System.out.println(mid);
//				break;
//			}
//			if(ele>a[mid])
//				start=mid+1;
//			else
//				end=mid-1;
//		}
//		if(cnt==0)
//			System.out.println("not found");
		
		
		
		
		
//		int a[]= {5,3,6,1};
//		
//		for(int i=0;i<a.length;i++)
//		{
//			int mid=i;
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[j]>a[mid])
//					mid=j;
//			}
//			int temp=a[i];
//			a[i]=a[mid];
//			a[mid]=temp;
//		}
//		System.out.println(Arrays.toString(a));
		
		
		
		
		
		
		
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter size of array");
//		int size=sc.nextInt();
//		int a[]=new int[size];
//		for(int i=0;i<size;i++)
//		{
//			System.out.println("enter "+i+" element");
//			int ele=sc.nextInt();
//			a[i]=ele;
//		}
//		System.out.println(Arrays.toString(a));
		
		
		
		
		
//		int num=6;
//		int cnt=0;
//		for(int i=1;i<=num;i++)
//		{
//			if(i*i==num)
//				cnt++;
//		}
//		if(cnt==1)
//			System.out.println("perfect square");
//		else
//			System.out.println("not");
		
//		int val=1235;
//		var loop=0;
//		while(val>0)
//		{
//			val=val/10;
//			loop++;
//		}
//		System.out.println(val);
		
		
//		int i=25,j=2;
//		
//		while(i>9||j<15)
//		{
//			i-=3;
//			j+=2;
//			System.out.println(i+j+"-");
//		}
		
		
//	

//		byte b=9;
//		
		
//		Scanner sc=new Scanner(System.in);
//		String st=sc.nextLine();
//		System.out.println(st);
//		
		
//		for(int i=1;i<=8;i++)
//		{
//			for(int j=1;j<=22;j++)
//			{
//				if(i==1 || i==8 || j==1 || j==22)
//					System.out.print("*");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}
		
		
		
		// armstrong
		
//	int num=153;
//	//System.out.println(num);
//	int tem=num;
//	int tem1=num;
//	
//	int digit=0;
//	while(num>0)
//	{
//		int rem=num%10;
//		digit++;
//		num=num/10;
//	}
//	//System.out.println(tem);
//	
//	int arm=1;
//	int sqr1=0;
//	while(tem>0)
//	{
//		int rem=tem%10;
//		int sqr=(int)Math.pow(rem, digit);
//		System.out.println(sqr);
//		sqr1=sqr;
//		tem=tem/10;
//	}
//	System.out.println(sqr1);
////	if(arm==tem1)
////		System.out.println("armstrong");
////	else
////		System.out.println("not a armstrong");
//	
		
		
		// NEON NUMBER
		
//		int num=4;
//		 int sq=num*num;
//		 int sum=0;
//		 while(sq>0)
//		 {
//			 int rem=sq%10;
//			 sum=sum+rem;
//			 sq=sq/10;
//		 }
//		 if(num%sum==0)
//			 System.out.println("neon number");
//		 else
//			 System.out.println("not a neon number");
//		 

	}

}
