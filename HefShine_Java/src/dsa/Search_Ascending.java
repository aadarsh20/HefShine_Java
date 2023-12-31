package dsa;

import java.util.Arrays;

public class Search_Ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] ={4,5,6,7,0,1,2};
		int num=4;
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
		//System.out.println(Arrays.toString(a));
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
				cnt++;
		}
		if(cnt>0)
			System.out.println("0");
		else
			System.out.println("-1");
	}

}
