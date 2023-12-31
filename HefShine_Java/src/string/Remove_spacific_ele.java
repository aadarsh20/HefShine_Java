package string;

public class Remove_spacific_ele {

	public static void main(String[] args) 
	{
		String s1="aadarsh";
		char rem='a';
		String s2=s1.toLowerCase();
		
		String ans=rem(s2,rem);
		if(s1.length()==ans.length())
			System.out.println("not found");
		else
			System.out.println(ans);
	}
	private static String rem(String s2,char rem) 
	{
		String s3="";
		for(int i=0;i<s2.length();i++)
		{
			if(s2.charAt(i)!=rem)
				s3+=s2.charAt(i);
		}
		return s3;
	}
}
