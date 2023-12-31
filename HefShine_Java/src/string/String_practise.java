package string;

public class String_practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="  hello a darsh i am from r as al";
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			for (int j = i+1; j < s1.length(); j++) 
			{
				if(s1.charAt(i)>='A' || s1.charAt(i)<='Z' || s1.charAt(j)>='a' || s1.charAt(i)<='z')
					s2+=s1.charAt(i);
			}
		}
		System.out.println(s2);

	}

}
