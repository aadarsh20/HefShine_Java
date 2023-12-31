package string;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="aadarsh";
		String s2="";
		String ans=repl(s1,s2);
		System.out.println(ans);

	}

	private static String repl(String s1,String s2) 
	{
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a')
				s2+='s';
			else
				s2+=s1.charAt(i);
		}
		return s2;
		
	}

}
