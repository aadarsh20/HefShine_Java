package string;

public class Element_twice {

	public static void main(String[] args) {
		String s1="aadarsh";
		
		String ans=str(s1);
		System.out.println(ans);
	}

	private static String str(String s1) 
	{
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			s2=s2+s1.charAt(i)+s1.charAt(i);
		}
		return s2;
	}		
		
//		String s1="hefshine";
//		String s2="";
//		for(int i=0;i<s1.length();i++)
//		{
//			s2=s2+s1.charAt(i)+s1.charAt(i);
//		}
//		System.out.println(s2);


}
