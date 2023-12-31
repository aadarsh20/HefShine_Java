package dsa;

public class ZeroOneTwo {

	public static void main(String[] args) 
	{
		
		int a[]= {0,1,2,0,1,2,0,1,2,};
		
		int cnt0=0;
		int cnt1=0;
		int cnt2=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
				cnt0++;
			else if(a[i]==1)
				cnt1++;
			else
				cnt2++;
		}
		System.out.println(cnt0);
	}

}
