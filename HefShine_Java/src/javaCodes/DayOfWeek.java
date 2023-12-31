package javaCodes;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number beetwin 1 to 7 : ");
		int s1=sc.nextInt();
		
		//If-Else
		/*if(s1==1)
			System.out.println("Monday");
		else if(s1==2)
			System.out.println("Tuesday");
		else if(s1==3)
			System.out.println("Wednesday");
		else if(s1==4)
			System.out.println("Thursday");
		else if(s1==5)
			System.out.println("Friday");
		else if(s1==6)
			System.out.println("Saturday");
		else if(s1==7)
			System.out.println("Sunday");
		else
		{
			System.out.println("Number does not match");
			System.out.println("Please enter valid number");
		}*/
		
		//Switch
		switch(s1)
		{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("PLease enter valid number");
			
		}

	}

}
