package pattern;

public class Pattern92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int end=1;
		int space=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(j<=space)
				System.out.print(" ");
				else
					System.out.print("N");
			}
			System.out.println();
			end++;
			space++;
		}

	}

}
