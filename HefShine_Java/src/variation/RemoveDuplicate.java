package variation;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		int a[]= {2,1,5,4,3,2,1,6,4,2};
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=i;j<a.length;j++)
			{
				if(a[i]==a[j])
					cnt++;
			}
			if(cnt==0)
				System.out.println(a[i]);
		}
	}

}
