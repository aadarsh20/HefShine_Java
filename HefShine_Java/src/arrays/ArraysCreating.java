package arrays;

import java.util.Scanner;

public class ArraysCreating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("First way to create array");
		// First way to create array
		int arr[]= {10,20,30,40,50};
		
		// For get value
		System.out.println(arr[2]); 
		
		// For set value
		arr[2]=100;
		System.out.println(arr[2]);
		
		
		
		System.out.println();
		System.out.println("Second way to create array");
		// Second way to create array 
		int ar[]=new int[3];
		
		// For intilized a value
		ar[0]=12;  
		ar[1]=56;
		ar[2]=35;
		
		// For print all values
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		
		// For get value
		System.out.println(ar[1]); 

		// For set value
		ar[1]=100;
		System.out.println(ar[1]);
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter a size");
//		
//		//int ar1=new int[3];
//		
//		int arr[]= {1,2,3,4,5};
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
		
	}

}
