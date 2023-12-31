package smart_programming;

import java.util.Arrays;

public class Two_Array_in_one_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		int b[]= {6,7,8,9,1};
		int c[]=new int[a.length+b.length];
		int index=0;
			if(a.length>=b.length)
			{
				for(int i=0;i<a.length;i++)
				{
					c[index++]=a[i];
					c[index++]=b[i];
				}
			}
			else
			{
				for(int i=0;i<b.length;i++)
				{
				c[index++]=b[i];
				c[index++]=a[i];
				}
			}
			System.out.println(Arrays.toString(c));

	}

}
