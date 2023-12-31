package variation;

public class SamadhanPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dash1=4;
		int dash2=3;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(j<=dash1 || j>=dash2)
					System.out.print("-");
				else
					System.out.print("*-");
			}
			System.out.println();
			dash1--;
			dash2++;
			
		}

	}

}
