package pattern;

public class Pattern56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//	     1 
//	    1 2 
//	   1 2 3 
//	  1 2 3 4 
//	 1 2 3 4 5 
		
		
		
//		int space=4;
//		for(int i=1;i<=5;i++)
//		{
//			int num=1;
//			for(int j=1;j<=5;j++)
//			{
//				if(j<=space)
//					System.out.print(" ");
//				else
//				{
//					System.out.print(num+" ");
//					num++;
//				}
//			}
//				System.out.println();
//				space--;
//		}

		
		
		int space=4;
		for(int i=1;i<=9;i++)
		{
			int num=1;
			for(int j=1;j<=5;j++)
			{
				if(j<=space)
					System.out.print(" ");
				else
				{
					System.out.print(num+" ");
					num++;
				}
			}
				System.out.println();
				if(i<5)
					space--;
				else
					space++;
		}

		
		
	}

}
