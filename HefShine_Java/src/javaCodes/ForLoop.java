package javaCodes;

import java.util.Scanner;
public class ForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("Enter number : ");
		int s1=sc.nextInt();
		if(s1<=0)
		{
			break;
		}
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+" X "+s1 + " = "+ i*s1);
		}
		}
	}
}
