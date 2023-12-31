package javaCodes;

import java.util.Scanner;

public class CountNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
	    int cnt=0;
		while(num>0)
		{
			if((num%10)==3)
			//num=num/10;
			cnt++;
		}
		System.out.println("Count of number is : "+cnt);

	}

}
