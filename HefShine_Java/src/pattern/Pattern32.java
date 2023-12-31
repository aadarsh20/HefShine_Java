package pattern;

public class Pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int end=6;
		for(int i=1;i<=6;i++)
		{
			char ch='F';
			for(int j=1;j<=end;j++)
			{
				System.out.print(ch);
				ch--;
			}
			System.out.println();
			end--;
			
		}

	}

}
