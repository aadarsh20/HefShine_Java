package pattern;

public class Pattern44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int end=5;
		int space=4;
		int num=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(j<=space)
					System.out.print(" ");
				else
					System.out.print(num);
			}
			System.out.println();
			num++;
			space--;
			end++;
		}
		
	}

}
