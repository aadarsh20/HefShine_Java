package arrays;

import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a array size");
		int num=sc.nextInt();
		
		
		int arr[]=new int[num];
		System.out.println("enter a numbers");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
		

	}

}
