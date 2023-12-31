package arrays;

public class UniqueCnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,2,1,4,5,2};
		
		int uniqueCnt=0;
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
					cnt++;
			}
			if(cnt==0)
				uniqueCnt++;
		}
		System.out.println(uniqueCnt);

	}

}
