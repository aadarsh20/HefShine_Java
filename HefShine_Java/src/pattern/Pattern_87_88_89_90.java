package pattern;

public class Pattern_87_88_89_90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Pattern..87..................");
		System.out.println();
		
		int start=1;
		int end=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==start || j==end)
					System.out.print("A");
				else
					System.out.print(" ");
			}
			System.out.println();
			start++;
			end--;
		}
		
		System.out.println();
		System.out.println("Pattern..88..................");
		System.out.println();
		
		
		
	}

}
