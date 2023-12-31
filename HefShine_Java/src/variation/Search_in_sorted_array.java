package variation;

import java.util.Arrays;

public class Search_in_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {5,6,7,8,9,10,1,2,3};
		int key=3;
		for(int i=0;i<a.length;i++)
		{
			int mid=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[mid])
					mid=j;
			}
			int temp=a[i];
			a[i]=a[mid];
			a[mid]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
				System.out.println("Found at index : "+i);
		}
	}

}
