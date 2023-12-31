package javaCodes;

import java.util.Scanner;

public class Percentage {
//113
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter marathi sub marks : ");
		int mar=sc.nextInt();
		
		System.out.println("enter hindi sub marks : ");
		int hin=sc.nextInt();
		
		System.out.println("enter english sub marks : ");
		int eng=sc.nextInt();
		
		System.out.println("enter maths sub marks : ");
		int mat=sc.nextInt();
		
		System.out.println("enter science sub marks : ");
		int sci=sc.nextInt();
		
		int sum=mar+hin+eng+mat+sci;
		System.out.println("Total marks obtained : "+sum);
		System.out.println();
		
		double per=(sum*100)/500.0;
		System.out.println("total percent obtain : "+per);
		System.out.println();
		if(per>=90)
			System.out.println("Grade A");
		else if(per>=80)
			System.out.println("Grade B");
		else if(per>=70)
			System.out.println("Grade C");
		else if(per>=60)
			System.out.println("Grade D");
		else if(per>=40)
			System.out.println("Grade E");
		else
			System.out.println("Grade F");
		

	}

}
