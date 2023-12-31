package string;

public class Uppercase_and_lowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//uppercase
		
		String s1="AaDaRsH";
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
			{
				char ch=(char)(s1.charAt(i)-32);
				s2+=ch;
			}
			else
			{
				s2+=s1.charAt(i);
			}
		}
		System.out.println(s2);
		
		//lowercase
		
		String s3="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
			{
				char ch=(char)(s1.charAt(i)+32);
				s3+=ch;
			}
			else
			{
				s3+=s1.charAt(i);
			}
		}
		System.out.println(s3);

	}

}
