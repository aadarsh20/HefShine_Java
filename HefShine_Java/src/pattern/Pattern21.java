
package pattern;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int space=4;
		int end=9;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(j<=space)
				System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
			space--;
			end--;
		}
	}

}
