package variation;

public class Ishan_chocolates {
	public static void main(String[] args) {
		int a[]= {5,3,1,6,5};
		int ans=str(a);	
		System.out.println(ans);
	}

	private static int str(int[] a) {
		// TODO Auto-generated method stub
		int i=0;
		int j=a.length-1;
		while(i!=j)
		{
			if(a[i]>a[j])
			{
				i++;
			}
			else
			{
				j--;
			}
		}
		return a[i];
		//System.out.println(a[i]);
		
	}

}
