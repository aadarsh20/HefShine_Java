package arrays;

import java.util.Arrays;

public class Copy_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4};
		System.out.println(Arrays.toString(a));
		
		int b[]=new int[a.length];
		for(int i=0;i<b.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(b));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int a[]= {10,20,30,40,50};
//		// Original Array of A
//		System.out.println("Array of A");
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.print(a[i]+" ");
//		}
//		System.out.println();
//		
//		int b[]=new int[a.length];
//		for(int i=0;i<a.length;i++)
//		{
//			b[i]=a[i];
//		}
//		// After copying 
//		System.out.println("Array of B");
//		System.out.println("After copy");
//		for(int i=0;i<b.length;i++)
//		{
//			System.out.print(b[i]+" ");
//		}
//		System.out.println();

	}

}
