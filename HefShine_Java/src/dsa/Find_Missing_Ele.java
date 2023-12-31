package dsa;

public class Find_Missing_Ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,4,3,5};
		
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>a[0])
				max=a[i];
		}
		//System.out.println(max);
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=1;j<max;j++)
			{
				if(a[j]==a[i])
					cnt++;
			}
			if(cnt==0)
				System.out.println(a[i]);
		}

	}

}
