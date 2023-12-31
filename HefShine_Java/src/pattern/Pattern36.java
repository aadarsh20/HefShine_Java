package pattern;

public class Pattern36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int end=1;
		char ch='A';
		for(int i=1;i<=6;i++)
		{
			char ch1=ch;
			for(int j=1;j<=end;j++)
			{
				System.out.print(ch1);
				ch1--;
			}
			System.out.println();
			end++;
			ch++;
		}

	}

}
