package arrays;

import java.util.Arrays;

public class LeaderElement {

	public static void main(String[] args) {
		
		int a[]= {5,6,7,0,1,3,2};
		
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
					cnt++;
			}
			if(cnt==0)
				System.out.println(a[i]);
		}
		
		
		
//		for(int i=0;i<a.length;i++)
//		{
//			int cnt=0;
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]<a[j])
//					cnt++;
//			}
//			if(cnt==0)
//				System.out.println(a[i]);
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		for(int i=0;i<a.length;i++)
//		{
//			int cnt=0;
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]>a[j])
//					cnt++;
//			}
//			if(cnt==0)
//				System.out.println(a[i]);
//		}
		
		
		

		// Leader element 
//		for(int i=0;i<a.length;i++)
//		{
//			int cnt=0;
//			for(int j=i+1;j<a.length;j++)
//		{
//				if(a[j]>a[i])
//				{
//					cnt++;
//					break;
//				}
//		}
//			if(cnt==0)
//				System.out.print(a[i]+" ");
//			//else
//				//System.out.println("Not leader element");
//		}
	}
}
