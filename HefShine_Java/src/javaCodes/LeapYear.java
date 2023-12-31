package javaCodes;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter a year : ");
		int year=sc.nextInt();
		
		if(year%4==0 && year%100==0 && year%400==0)
			System.out.println("Leap year");
		else
			System.out.println("Not a leap year");
		
		System.out.println("Enter y continue n for Break");
		char ch=sc.next().charAt(0);
		if(ch=='y' &&  ch=='Y')
		{
			continue;
		}
		else if(ch=='n' && ch=='N')
			break;
		else
			System.out.println("enter y or n");
		}
		
		
		
		
		
//		int year =8443;
//		if((year%4==0 && year%100!=0) || year%400==0)
//			System.out.println("Leap year");
//		else
//			System.out.println("Not a leap year");

	}

}
