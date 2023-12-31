package pattern;

public class Pattern49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int space=8;
		for(int i=1;i<=9;i++)
		{
			int num=1;
			for(int j=1;j<=9;j++)
			{
				if(j<=space)
					System.out.print(" ");
				else
				{
					System.out.print(num);
					num++;
				}
			}
			System.out.println();
			space--;
		}
	}

}
