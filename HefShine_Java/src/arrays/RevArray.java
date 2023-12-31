package arrays;

import java.util.Arrays;

public class RevArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//temperory rev
//		int[]a= {1,2,3,4};
//		//int rev[]= {0};
//		for(int i=a.length-1;i>=0;i--)
//		{
//				System.out.print(a[i]+" ");
//		}

		
		
	//	using third variable
//		int[]a= {1,2,3,4};
//		
//		int start=0;
//		int end=a.length-1;
//		
//		while(start<end)
//		{
//		int temp=a[start];
//		a[start]=a[end];
//		a[end]=temp;
//		
//		start++;
//		end--;
//		
//		}
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.print(a[i]+" ");
//		}
//		
		
		int[]a= {1,2,3,4};
		int start=0;
		int end=a.length-1;
		while(start<end)
		{
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			
			start++;
			end--;
		}
		System.out.println(Arrays.toString(a));
	}

}
