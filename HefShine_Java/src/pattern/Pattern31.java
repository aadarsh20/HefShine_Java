package pattern;

public class Pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int end=6;
		for(int i=1;i<=12;i++)
		{
			char ch='A';
			for(int j=1;j<=end;j++)
			{
				System.out.print(ch);
				ch++;
			}
			System.out.println();
			if(i<6)
			end--;
			else if(i==7)
				end++;
			else
				end++;
				
		}
	}

}
