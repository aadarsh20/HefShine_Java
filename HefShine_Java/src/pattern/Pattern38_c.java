package pattern;

public class Pattern38_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int end=1;
		int cnt=1;
		for(int i=1;i<=5;i++)
		{
			int cnt1=cnt;
			for(int j=1;j<=end;j++)
			{
				System.out.print(cnt1);
				cnt1--;
			}
			System.out.println();
			end++;
			cnt++;
		}
	}

}
