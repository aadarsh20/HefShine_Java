package javaCodes;

import java.util.Scanner;

public class CalculatorAdva {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("For addition enter ==> 1  ");
		System.out.println("For subtraction enter ==> 2  ");
		System.out.println("For multiplication enter ==> 3  ");
		System.out.println("For divide enter ==> 4 ");
		
		//For Addition
		int s1input=sc.nextInt();
		if(s1input==1)
		{
			System.out.println("WE ADD ONLY TWO NUMBERS PLEASE ENTER VALID TWO NUMBER");
			System.out.println("For addition of two number");
			System.out.println("Enter first number : ");
			int a1=sc.nextInt();
			System.out.println("Enter second number : ");
			int a2=sc.nextInt();
			System.out.println("Addition of two number is : "+(a1+a2));
		}
		//For Subtraction
		else if(s1input==2)
		{
			System.out.println("WE SUBTRACT ONLY TWO NUMBERS PLEASE ENTER VALID TWO NUMBER");
			System.out.println("For subtraction of two number");
			System.out.println("Enter first number : ");
			int sub1=sc.nextInt();
			System.out.println("Enter second number : ");
			int sub2=sc.nextInt();
			System.out.println("Subtraction of two number is : "+(sub1-sub2));
		}
		//For Multiplication
		else if(s1input==3)
		{
			System.out.println("WE MULTIPLY ONLY TWO NUMBERS PLEASE ENTER VALID TWO NUMBER");
			System.out.println("For multiply of two number");
			System.out.println("Enter first number : ");
			int m1=sc.nextInt();
			System.out.println("Enter second number : ");
			int m2=sc.nextInt();
			System.out.println("Multiplication of two number is : "+(m1+m2));
		}
		else if(s1input==4)
		{
			System.out.println("WE DIVIDE ONLY TWO NUMBERS PLEASE ENTER VALID TWO NUMBER");
			System.out.println("For divide of two number");
			System.out.println("Enter first number : ");
			int d1=sc.nextInt();
			System.out.println("Enter second number : ");
			int d2=sc.nextInt();
			System.out.println("divide of two number is : "+(d1+d2));
		}
		else
			System.out.println("Please enter valid number");
		
	}

}
