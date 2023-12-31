package dsa;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) 
	{
		int a[]= {4,3,8,6,-3,-5};
		
		for(int i=0;i<a.length;i++)
		{
			int mid=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[mid])
					mid=j;
			}
			int temp=a[i];
			a[i]=a[mid];
			a[mid]=temp;
		}
		System.out.println(Arrays.toString(a));
		
		
	}
}
		
//		int a[]= {4,2,5,6,8};
//		
//		for(int i=0;i<a.length;i++)
//		{
//			int min=i;
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[j]<=a[min])
//					min=j;
//			}
//			int temp=a[i];
//			a[i]=a[min];
//			a[min]=temp;
//		}
//		System.out.println(Arrays.toString(a));
//	}
//}
