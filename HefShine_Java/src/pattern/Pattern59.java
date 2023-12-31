package pattern;

public class Pattern59 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
//		12345
//		 2345
//		  345
//		   45
//		    5
//		
//		
//		
//		int space=0;
//		int cnt=1;
//		for(int i=1;i<=5;i++)
//		{
//			int num=cnt;
//			for(int j=1;j<=5;j++)
//			{
//				if(j<=space)
//				System.out.print(" ");
//				else
//				{
//					System.out.print(num);
//					num++;
//				}
//				}
//			System.out.println();
//			space++;
//			cnt++;
//		}
		
		int space=0;
		for(int i=1;i<=5;i++)
		{
			int num=1;
			for(int j=1;j<=5;j++)
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
			space++;
		}
		
		
	}

}
