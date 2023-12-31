package dsa;

public class BInarySearch {

	public static void main(String[] args) 
	{
		//for binary search it will first sorted after that we implement binary search on that
//		int a[]= {2,4,6,7,8};
//		int ele=0;
//		
//		int start=0; //li
//		int end=a.length-1; //hi
//		int cnt=0;
//		while(start<=end)
//		{
//		int mid=(start+end)/2;
//		if(a[mid]==ele)
//		{
//			System.out.println(mid);
//			break;
//		}
//		else if(a[mid]<ele)
//			start=mid+1;
//		else if(a[mid]>ele)
//			end=mid-1;
//		else
//			System.out.println("not found");
//		}
//	}
		
		
		int a[]= {1,4,6,8,9};
		int ele=0;
		int start=0;
		int end=a.length-1;
		int cnt=0;
		while(start<=end)
		{
		int mid=(start+end)/2;
		if(a[mid]==ele)
		{
			cnt++;
			System.out.println(mid);
			break;
		}
		else if(ele>mid)
			start=mid+1;
		else
			end=mid-1;
		}
		if(cnt==0)
			System.out.println("not found");
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
