package javaCodes;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter a factorial number : ");
		int num=sc.nextInt();
		int fact=1;
		int num=5;
		for(int i=1;i<=num;++i)
		{
			fact*=i;
		}
		System.out.println(fact);*/
		
		
		
		// Another way
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter no : ");
		int num=sc.nextInt();
		int fact=1;
		while(true) {
		for(int i=1;i<=num;i++)
		{
			fact=fact*num;
			num--;
		}
		System.out.println(fact);
		break;
		}
		

	}

}
