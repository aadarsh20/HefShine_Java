package homePractise;

import java.util.Scanner;

public class RockPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		
		int ar[]=new int[size];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
		System.out.println(ar[i]);
		}
		

	}

}
