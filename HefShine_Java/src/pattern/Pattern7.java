package pattern;

public class Pattern7 {

	public static void main(String[] args) {
	
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
		
//				int HashEnd=4;
//				int StarEnd=1;
//				for(int i=1;i<=5;i++)
//				{
//					for(int j=1;j<=HashEnd;j++)
//					{
//						System.out.print("*");
//					}
//					for(int j=1;j<=StarEnd;j++)
//					{
//						System.out.print(" ");
//					}
//			
//					System.out.println();
//					HashEnd--;
//					StarEnd++;
//				}
		
		// Another way
		int cnt=0;               // For Space
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=cnt)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
			cnt++;
		}

			}


	}