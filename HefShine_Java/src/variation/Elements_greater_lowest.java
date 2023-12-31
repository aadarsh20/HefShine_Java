package variation;

public class Elements_greater_lowest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,8,10,11,12,19};
		int x=0,greCnt=0,lowCnt=0;

		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=x)greCnt++;
			if(a[i]<=x)lowCnt++;
		}
		System.out.println("lowest count : "+lowCnt+"\ngreater count : "+greCnt);
	}

}
