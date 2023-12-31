package string;

public class Compare_string_with_given_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="aada";
		String s2="aaa3a";
		int cnt=0;
		
		if(s1.length()==s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)==s2.charAt(i))
					cnt++;
			}
			if(cnt==s1.length())
				System.out.println("same");
			else
				System.out.println("not same");
		}
		else
			System.out.println("index not matched");
	}

}
