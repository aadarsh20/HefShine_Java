package dsa;

public class MissingNumber {

	public static void main(String[] args) 
	{
		int a[]= {4,5,3,2};
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=1;j<=5;j++)
			{
				if(a[i]==j)
					cnt++;
			}
			if(cnt==0)
				System.out.println(a[i]);
		}

	}

}
