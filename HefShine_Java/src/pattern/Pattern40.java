package pattern;

public class Pattern40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int space=4;
		int cnt=5;
		for(int i=1;i<=5;i++) 
		{
			int cnt1=cnt;
			int end=5;
			for(int j=1;j<=5;j++)
			{
				if(j<=space)
					System.out.print(" ");
				else
				{
					System.out.print(cnt1);
					cnt1--;
					
				}
			}
			System.out.println();
			space--;
			cnt++;
			cnt1--;
		}
		
		
		
//		12345
//		2345
//		345
//		45
//		5
//		
//		
//		int end=5;
//		int cnt=1;
//		for(int i=1;i<=5;i++)
//		{
//			int cnt1=cnt;
//			for(int j=1;j<=end;j++)
//			{
//				System.out.print(cnt1);
//				cnt1++;
//			}
//			System.out.println();
//			end--;
//			cnt++;
//		}
	}

}
