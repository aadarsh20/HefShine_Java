package arrays;

import java.util.*;

public class Left_Shift {

	public static void main(String[] args) 
	{
		int a[]= {11,22,33,44,55};
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		System.out.println(Arrays.toString(a));
		
		
		
		
		
//		int temp=a[0];
//		for(int i=0;i<a.length-1;i++)
//		{
//			a[i]=a[i+1];
//		}
//		a[a.length-1]=temp;
//		System.out.println(Arrays.toString(a));
		
		
		
		
		
		
		
		
		
//		int temp=a[0];
//		//while(a[0]==11)
//		//{
//		for(int i=0;i<a.length-1;i++)
//		{
//			a[i]=a[i+1];
//		}
//		a[a.length-1]=temp;
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]+" ");
//		}
//		//System.out.println(Arrays.toString(a));
//		}

	}

}
