package arrays2D;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) 
	{
		int a[][]= {{3,1,2},{8,9,7},{6,4,55,}};
		//int a[]= {3,5,14,5};
		for(int i=0;i<a.length;i++)
		{
			int min=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j][i]<min)
					min=a[j][i];
			}
//			int temp=a[i][j];
//			a[i][j]=a[min];
//			a[min]=temp;
		}
		System.out.println(Arrays.toString(a));
		
	}

}
