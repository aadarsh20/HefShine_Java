package arrays;

import java.util.Arrays;

public class Selection_Sort {

	public static void main(String[] args) 
	{		
		int a[]= {1,5,2,7,3};

		for(int i=0;i<a.length;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(j>a[min])
					min=j;
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
}
		
		
		
		
//		for(int i=0;i<a.length;i++)
//		{
//			int min=i;
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(j<a[min])
//				{
//					min=j;
//				}
//			}
//			int temp=a[i];
//			a[i]=a[min];
//			a[min]=temp;
//		}
//		System.out.println(Arrays.toString(a));
	//}
//}
