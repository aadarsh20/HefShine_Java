package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FirstPositive {

	public static void main(String[] args) 
	{
		
//		int a[]= {5,3,-1,-4,-3};
//		
//		for(int i=0;i<a.length;i++) 
//		{
//			for(int j=0;j<)
//		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a array size : ");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		int index=0;
		for(int i=1;i<=size;i++)
		{
			System.out.println("Enter a number : ");
			int num=sc.nextInt();
			a[i]=num;
			index++;
		}
		System.out.println(Arrays.toString(a));
	}

}
