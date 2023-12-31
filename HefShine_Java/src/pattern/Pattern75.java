package pattern;

public class Pattern75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int end=3;
		for(int i=2;i<=5;i++)
		{
			for(int j=1;j<=
					end;j++)
			{
				if(j==i)
					System.out.print(" ");
				else
					
				System.out.print("*");
			}
			System.out.println();
			end=end+2;
		}

	}

}
