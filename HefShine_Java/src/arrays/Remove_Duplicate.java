
package arrays;

public class Remove_Duplicate {

	public static void main(String[] args) 
	{
		int a[]= {2,1,5,4,3,2,1,6,4,2};
		
		int duplicateCnt=0;
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]==a[j])
				cnt++;
			}
			if(cnt==0)
			{
				duplicateCnt++;
			}
		}			
			//System.out.println("new array of length "+duplicateCnt);
//			int b[]=new int[duplicateCnt];
//			for(int j=0;j<a.length;j++)
//			{
//				if(a[j]==cnt)
//				{
//					b[duplicateCnt]=a[j];
//					duplicateCnt++;
//				}
//				
//			}
		}
	}

