package string;

public class Trim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="    fsghsdvs f   ";
		
		String ans=trim(s1);
		System.out.println(ans);

	}

	private static String trim(String s1) 
	{
		String s2="";
		int start=-1;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=' ')
			{
				start=i;
				break;
			}
		}
		
		int end=s1.length();
		for(int i=s1.length()-1;i>=0;i--)
		{
			if(s1.charAt(i)!=' ')
			{
				end=i;
				break;
			}
		}
		
		for(int i=start;i<=end;i++)
		{
			s2+=s1.charAt(i);
		}
		return s2;
	}

}
