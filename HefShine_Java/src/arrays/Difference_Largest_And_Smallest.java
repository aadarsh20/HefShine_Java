package arrays;

import java.util.Arrays;

public class Difference_Largest_And_Smallest {

	public static void main(String[] args) 
	{
		//There have two ways to
		//1st used two loops
		//2nd ascending array
		
		
		
		// 1st way
		//for max element
//		int a[]= {5,3,6,4,2,1};
//		int max=a[0];
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]>max)
//				max=a[i];
//		}
//		System.out.println(max);
//		
//		//for min element
//		int min=a[0];
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]<min)
//				min=a[i];
//		}
//		System.out.println(min);
//		
//		int mid=max-min;
//		System.out.println("differnce max and min is : "+mid);
		
		
		
		//2nd way
		
		int a[]= {5,3,6,4,2,1};
		for(int i=0;i<a.length;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
					min=j;
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		int dif=a[a.length-1]-a[0];
		System.out.println(dif);
		//System.out.println(Arrays.toString(a));
	}
}
