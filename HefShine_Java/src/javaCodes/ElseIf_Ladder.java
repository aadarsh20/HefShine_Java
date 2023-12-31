package javaCodes;

public class ElseIf_Ladder {

	public static void main(String[] args) {
		char ch='7';
		if(ch>='a' && ch<='z' || ch>'A' && ch<='Z')
		{
			System.out.println(ch+" input is alphabet");
		}
		else if(ch>'0' && ch<='9')
		{
			System.out.println(ch+" Input is number");
		}
		else
		{
			System.out.println(ch+" Input is special symbol");
		}
		
	
		
		
		/*//example 3rd
		
		char ch='^';
		if(ch>='a' && ch<='z' )
		{
			System.out.println("Character is lower case");
		}
		else if(ch>'A' && ch<='Z')
		{
			System.out.println("Character is upper case");
		}
		else
		{
			System.out.println("Character is symbol");
		}*/
		
		
		
		/*//Example 2ndq
		int Rn=	258;
		if(Rn<=100)
		{
			System.out.println("Enter in CR 1");
		}
		else if(Rn<=200)
		
		{
			System.out.println("Enter in CR 2");
		}
		else if(Rn<=250)
		{
			System.out.println("Enter in CR 3");
		}
		else if(Rn<=300)
		{
			System.out.println("Enter in CR 4");
		}
		else
		{
			System.out.println("There is no seat come tommarow");
		}*/
		
		
		
		
		
		//Exaple 1st
		
		/*int num=1;
		if(num==1)
		{
			System.out.println("Enter in CR 1");
		}
		else if(num==2)
		{
			System.out.println("Enter in CR 2");
		}
		else if(num==3)
		{
			System.out.println("Enter in CR 3");
		}
		else if(num==4)
		{
			System.out.println("Enter in CR 4");
		}
		else
		{
			System.out.println("There is no empty class");
		}*/
	}

}
