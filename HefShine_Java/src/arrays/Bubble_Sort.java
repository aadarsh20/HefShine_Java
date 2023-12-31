package arrays;

import java.util.Arrays;

public class Bubble_Sort 
{
	public static void main(String[] args) 
	{
		int a[]= {44,33,77,88,11,22};
		System.out.println("before sorting");
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			for (int j = 0; j < a.length-i-1; j++) 
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("After bubble sorting");
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
