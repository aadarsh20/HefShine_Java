package pattern;

public class Pattern103 {

	public static void main(String[] args) {
		
		int end=5;

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=end;j++)
			{
			if(i==1 || i==5 || j==1 || j==5)	
				System.out.print("*");
			else
				System.out.print(" ");
			}
			System.out.println();
		}
		

	}

}
