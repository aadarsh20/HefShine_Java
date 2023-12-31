package pattern;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int space=4;
		int end=5;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=end;j++)
				
			{
				if(j<=space)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
			if(i<5)
			{
				space--;
				end++;
			}
			else
			{
				end--;
				space++;
			}
		}
	}

}
