package pattern;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
//  * * * * *    *****
//   * * * *      ****
//    * * *
//     * * 
//      *
//     * *
//    * * *
//   * * * *
//  * * * * * 
		int space=0;
		int end=5;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=space)
					System.out.print(" ");
				else
					System.out.print("*"+" ");
				}
			System.out.println();
			if(i<5)
				space++;
			else
				space--;
			}
		}
		
 

	}
//
