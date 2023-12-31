package string;

public class Ends_with_another_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="aadarsh";
		String s2="rsh";
		
		if(s1.length()>=s2.length())
		{
			int s1Index=s1.length()-1;
			int s2Index=s2.length()-1;
			int cnt=0;
		while(s2Index>=0)
		{
			
			if(s2.charAt(s2Index)==s1.charAt(s1Index))
			{
				cnt++;
			}
			s1Index--;
			s2Index--;
		}
		if(cnt==s2.length())
			System.out.println("same");
		else
			System.out.println("not same");
		}
		else
			System.out.println("not");
	}

}
