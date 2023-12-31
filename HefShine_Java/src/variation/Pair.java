package variation;

public class Pair {

	public static void main(String[] args) {
		
		int a[]= {1,2,1};
		
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=i-1;j>0;j++)
			{
				if(a[i]==a[j])
					cnt++;
			}
			int b[]= new int[cnt];
			int index=0;
			if(cnt==0)
			{
				b[index]=a[i];
				index++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println();
		}

	}

}
