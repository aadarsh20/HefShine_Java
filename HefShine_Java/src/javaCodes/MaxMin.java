package javaCodes;

import java.util.Scanner;

public class MaxMin {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter first no : ");
		int num1=sc.nextInt();
		
		System.out.println("enter second no : ");
		int num2=sc.nextInt();
		
		System.out.println("enter third no : ");
		int num3=sc.nextInt();

		if(num1>num2 && num1>num3)
		{
			System.out.println(num1 +" : "+ "is max number");
			if(num2<num3)
				System.out.println(num2 +" : "+"  is min number");
			else
				System.out.println(num3 +" : "+" is min number");
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println(num2 +" : "+ "is max number");
			if(num3<num1)
				System.out.println(num3 +" : "+"  is min number");
			else
				System.out.println(num1 +" : "+" is min number");
		}
		else 
		{
			System.out.println(num3 +" : "+ "is max number");
			if(num1<num2)
				System.out.println(num1+" : "+" is min number");
			else
				System.out.println(num2 + " : "+" is min number");
		}
	}

}
