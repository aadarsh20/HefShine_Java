package variation;

public class PrimeGivenRange {

	private static boolean prim(int i) 
	{
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		
		for(int i=2;i<=20;i++)
		{
			boolean res=prim(i);
			if(res==true)
				System.out.println(i);
		}

	}

}
