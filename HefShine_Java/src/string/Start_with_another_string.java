package string;

public class Start_with_another_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="aadarsh";
		String s2="aadrjzchjs";
		String ans=str(s1,s2);
		System.out.println(ans);
		
	}

	private static String str(String s1, String s2) {
		// TODO Auto-generated method stu
		
		int cnt=0;
		if(s1.length()>=s2.length())
		{
		for(int i=0;i<s2.length();i++)
		{
			if(s1.charAt(i)==s2.charAt(i))
				cnt++;
		}
		if(cnt==s2.length())
			return "same";
		else
			return "not";
		}
		else
		{
			return "size not same";
		}
		
	}

}
