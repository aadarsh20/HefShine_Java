package pattern;

public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int start=5;
//		int end=6;
//		for(int i=1;i<=9;i++)
//		{
//			for(int j=1;j<=10;j++)
//			{
//				if(j<=start || j>=end)
//				System.out.print("*");
//				else
//					System.out.print(" "
//							+ "");
//			}
//			System.out.println();
//			if(i<5)
//			{
//				start--;
//				end++;
//			}
//			else 
//			{
//				start++;
//				end--;
//			}
//		
//		}
		
		
		

//		int end=5;
//		//int start=10;
//		int space=4;
//		for(int i=1;i<=9;i++)
//		{
//			for(int j=1;j<=end;j++)
//			{
//				if(j<=space)
//					System.out.print(" ");
//				else
//					System.out.print("*");
//			}
//			System.out.println();
//			if(i<5)
//			{
//				space--;
//				end++;
//			}
//			else
//			{
//				space++;
//				end--;
//			}

		int start=5;
		int end=6;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=10;j++)
			{
				if(j<=start || j>=end)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			if(i<5)
			{
				start--;
				end++;
			}
			else
			{
				start++;
				end--;
			}
		}
	}
	}

