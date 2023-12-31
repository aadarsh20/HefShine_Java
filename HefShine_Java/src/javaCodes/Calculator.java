package javaCodes;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter first no");
		int num1=sc.nextInt();
		
		System.out.println("enter second no");
		int num2=sc.nextInt();
		
		System.out.println("enter operator");
		char ch=sc.next().charAt(0);
		
		if(ch=='+') 
		{
			System.out.println("Ans : "+(num1+num2));
		}
		else if(ch=='-') 
		{
			System.out.println("Ans : "+(num1-num2));
		}
		else if(ch=='*') 
		{
			System.out.println("Ans : "+(num1*num2));
		}
		else if(ch=='/') 
		{
			System.out.println("Ans : "+(num1/num2));
		}
		else 
		{
			System.out.println("operator3 is not match");
		}
		
		
		
		
		
		
		/*int num1=45;
		int  num2=84;
		char ch='+';
		
		if(ch=='+') 
		{
			System.out.println(num1+num2);
		}
		if(ch=='-') 
		{
			System.out.println(num1-num2);
		}
		if(ch=='*') 
		{
			System.out.println(num1*num2);
		}
		if(ch=='/') 
		{
			System.out.println(num1/num2);*/
		}
	}


