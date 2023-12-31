package pattern;

public class Pattern39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int end=1;
		for(int i=1;i<=5;i++)
		{
			int start=5;
			for (int j = 1; j <=end; j++) {
				System.out.print(start);
				start--;
			}
			System.out.println();
			end++;
		}
	}

}
