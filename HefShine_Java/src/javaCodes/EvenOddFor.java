package javaCodes;

import java.util.Scanner;

public class EvenOddFor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no where you want to start");
		int num1=sc.nextInt();
		System.out.println("Enter no where you want to end");
		int num2=sc.nextInt();
		for(int i=num1;i<=num2;i++)
		{
			if(i%2==0)
				System.out.println(i+" ==> even number");
		}
		System.out.println( );
		for(int j=num1;j<=num2;j++)
		{
		    if(j%2!=0)
				System.out.println(j+ " ==> odd number");
		
		}

	}

}
