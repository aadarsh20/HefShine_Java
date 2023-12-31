package variation;

import java.util.Arrays;

public class Non_5_And_5 {

	public static void main(String[] args) {
		
		int a[]= {11,25,33,44,55,66,75,88};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]%5==0 && a[j]%5!=0)
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		//System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
}
