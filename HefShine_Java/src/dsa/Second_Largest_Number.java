package dsa;

import java.util.Arrays;

public class Second_Largest_Number {

	public static void main(String[] args) 
	{
		int a[]= {5,2,6,8,4,3,7};
		
		for(int i=0;i<a.length;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
				{
					if(a[j]<a[min])		
						min=j;
				}
			 int temp = a[i];
			 a[i]=a[min];
			 a[min]=temp;
		}
		System.out.println(Arrays.toString(a));
		System.out.println(a[1]);
	}

}
