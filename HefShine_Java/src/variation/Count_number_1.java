package variation;

public class Count_number_1 {

	public static void main(String[] args) {
		
		int a[]= {11,12,13,14,15};
		int k=1;
		int ans=num(a,k);
		System.out.println(ans);
	}
	private static int num(int[] a, int k) {
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			while(a[i]>0)
			{
				int rem=a[i]%10;
				if(rem==k)
					cnt++;
				a[i]/=10;
			}
		}
		return cnt;	
	}
}