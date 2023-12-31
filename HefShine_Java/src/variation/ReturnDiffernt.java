package variation;
public class ReturnDiffernt {
	public static int diff(int a[],int b[])
	{
		for(int i=0;i<b.length;i++)
		{
			if(a[i]!=b[i])
				return a[i];
		}
		return a[a.length-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,4,6,8,9,10,12};
		int b[]= {2,4,6,8,10};
		int ans=diff(a,b);
		System.out.println(ans);
		
	}	
	}
