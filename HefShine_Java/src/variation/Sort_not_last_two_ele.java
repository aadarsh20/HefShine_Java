package variation;

import java.util.Arrays;

public class Sort_not_last_two_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,8,7,1,5};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length-2; i++) {
			System.out.println(a[i]);
		}

	}

}
