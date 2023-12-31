package pattern;

public class Pattern39_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space=4;
		for(int i=1;i<=5;i++)
		{
			int end=5;
			for(int j=1;j<=5;j++)
			{
				if(j<=space)
					System.out.print(" ");
				else
				{
					System.out.print(end);
					end--;
				}
				
			}
			System.out.println();
			space--;
		}

	}

}
