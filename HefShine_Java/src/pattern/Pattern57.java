package pattern;

public class Pattern57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int end=1;
//		int cnt=1;
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=end;j++)
//			{
//				System.out.print(cnt);
//				cnt++;
//			}
//			System.out.println();
//			end++;
//		}
//		
		
		int end=1;
		int num=1;
		for(int i=1;i<=5;i++)
		{
			int dif=4;
			int num1=num;
			for(int j=1;j<=end;j++)
			{
				System.out.print(num1+" ");
				num1=num1+dif;
				dif--;
			}
			System.out.println();
			end++;
			num++;
			
		}
		
	}

}
