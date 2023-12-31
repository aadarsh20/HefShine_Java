package pattern;

public class Pattern46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int end=1;
		int num=1;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=end;j++)
			{
				System.out.print(num);
			}
			System.out.println();
			end++;
			num++;
		}
	}
}
