package variation;

public class Find_factorial_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int range=5;
		for(int i=1;i<=range;i++)
		{
			int fact=1;
			for(int j=1;j<=i;j++)
			{
				fact=fact*j;
			}
			System.out.println("Fact of "+i+" : "+fact);
		}

	}

}
