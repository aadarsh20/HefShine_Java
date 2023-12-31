package pattern;

public class Pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end=5;
		char ch='F';
		for(int i=1;i<=12;i++)
		{
			char ch1=ch;
			for(int j=1;j<=end;j++)
			{
				System.out.print(ch1);
				ch1--;
			}
			System.out.println();
			if(i<6)
			{
			end--;
			ch--;
			}
			else
			{
				end++;
				ch++;
			}
		}
		

	}

}
