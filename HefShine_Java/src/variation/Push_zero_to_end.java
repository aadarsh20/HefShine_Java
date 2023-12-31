package variation;

import java.util.Arrays;

public class Push_zero_to_end {

	public static void main(String[] args) {
		
		int a[]= {0,0,4,9,0,7};
		int start=0;
		int end=a.length-1;
		while(start<=end)
		{
			if(a[start]==0 && a[end]!=0)
			{
				int temp=a[start];
				a[start]=a[end];
				a[end]=temp;
			}
			if(a[end]==0)end--;
			if(a[start]!=0)start++;
		}
//		for (int i = 0; i < a.length-1; i++) 
//		{
//				if(a[i]==0 && a[i+1]!=0 && a)
//				{
//					int temp=a[i];
//					a[i]=a[i+1];
//					a[i+1]=temp;
//				}
//		}
		System.out.println(Arrays.toString(a));
	}
}