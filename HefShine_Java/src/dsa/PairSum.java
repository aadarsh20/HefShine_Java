package dsa;

public class PairSum {

	public static void main(String[] args) 
	{
		int a[]= {2,4,6,3,5,7};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]+a[j]==7)
					System.out.println(a[i]+" "+a[j]);
			}
		}
	}

}
