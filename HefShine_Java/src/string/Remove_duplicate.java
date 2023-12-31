package string;

public class Remove_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="aadarsh kha de";
		
		for(int i=0;i<s1.length();i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{			
				if(s1.charAt(i)==s1.charAt(j))
				{
					cnt++;
					break;
				}
			}
			if(cnt==0) System.out.print(s1.charAt(i));
		}

	}

}
