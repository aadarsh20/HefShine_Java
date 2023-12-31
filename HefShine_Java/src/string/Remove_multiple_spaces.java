package string;

public class Remove_multiple_spaces {

	public static void main(String[] args) {
		
		String s1="   hi   aadarsh     how    are   you";
		s1=s1.trim();
		String s2="";
		String ans=rem(s1,s2);
		System.out.println(ans);
	}
	private static String rem(String s1,String s2) 
	{
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==' ' && s1.charAt(i+1)==' ')
				continue;
			else
				s2+=s1.charAt(i);
		}
		return s2;
	}
}
