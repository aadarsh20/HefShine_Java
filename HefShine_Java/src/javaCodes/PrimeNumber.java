package javaCodes;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter no : ");
		int num=sc.nextInt();
		int cnt=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				cnt++;
		}
		if(cnt==2) {
			
			System.out.println(num+" is a Prime number");
		System.out.println();
		}
		else
		{
			System.out.println(num+ " Not a prime number");
		System.out.println();
		}
	}

	}

}
