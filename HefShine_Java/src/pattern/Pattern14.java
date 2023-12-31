package pattern;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		*****
//		 ****
//		  ***
//		   **
//		    *
//		   **
//		  ***
//		 ****
//		*****
		
		int cnt=0;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=cnt)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
			if(i<5)
				cnt++;
			else
				cnt--;
		}

	}

}
