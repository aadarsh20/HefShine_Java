package variation;

public class ReturnDiffUnsorted {

	public static int vai(int a[],int b[])
	{
		for(int i=0;i<a.length;i++)
		{
			int cnt=omk(b,a[i]);
			if(cnt==0)
				return a[i];
		}
		return a[a.length-1];
	}
	public static int omk(int b[],int num)
	{
		int cnt=0;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==num)
				cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) 
	{
		int a[]= {1,7,2,6,3,5,4};
		int b[]= {1,3,5,7,4,2};
		int res=vai(a,b);
		
		System.out.println(res);
	}
}
