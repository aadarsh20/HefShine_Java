package dsa;

import java.util.Arrays;

public class Bubble_sort {

	public static void main(String[] args) {
		
		int a[]= {4,36,19,29,12,5};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[i])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	System.out.println(Arrays.toString(a));
	}
}
