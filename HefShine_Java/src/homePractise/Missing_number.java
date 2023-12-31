package homePractise;

import java.util.Arrays;

public class Missing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[]= {1,3,5,2,2};
//		int n=a.length;
//		 long ans=0;
//	        for(int i=0;i<n;i++)
//	        {
//	            int fsum=0;
//	            int ssum=0;
//	            for(int j=0;j<i;j++)
//	            {
//	                fsum+=a[j];
//	            }
//	            for(int j=i+1;j<n;j++)
//	            {
//	                ssum+=a[j];
//	            }
//	            if(fsum==ssum)
//	            {
//	            ans=i+1;
//	            break;
//	            }
//	        }
//	        System.out.println(ans);
		
		//missing number
		
//		int a[]= {6,1,2,8,3,4,7,10,5};
//		Arrays.sort(a);
//		int cnt=0;
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]!=i+1)
//			{
//				cnt=i+1;
//				break;
//			}
//		}
//		System.out.println(cnt);

		
//		Input: nums = [3,4,-1,1]
//				Output: 2
		

		int a[]= {3,4,-1,1};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=i+1)
			{
				System.out.println(i+1);
				break;
			}
		}
	}

}
