package pattern;

public class Pattern84_85_86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Pattern..84..................");
		System.out.println();
		
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==3 || i==3)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("Pattern..85..................");
		System.out.println();
		
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==3 || i==3)
					System.out.print("*");
				else
					System.out.print("0");
			}
			System.out.println();
		}

		
		
		System.out.println();
		System.out.println("Pattern..86..................");
		System.out.println();
		
		int start=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==start)
					System.out.print("0");
				else
					System.out.print("X");
			}
			System.out.println();
			start++;
		}
	}

}
