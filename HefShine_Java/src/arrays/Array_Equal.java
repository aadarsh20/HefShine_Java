package arrays;

public class Array_Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a[]= {10,20,30,40};
//		int b[]= {10,20,30,40};
//		
//		//a[2]=0;
//		if(a.length==b.length)
//		{
//			int cnt=0;
//			for(int i=0;i<a.length;i++)
//			{
//			if(a[i]==b[i])
//				cnt++;
//			}
//			if(cnt==a.length)
//				System.out.println("Array is equal");
//			else
//				System.out.println("not equal");
//		}
//		else
//			System.out.println("Array size is not eual");

		
		int a[]= {10,20,30,40};
		int b[]= {10,20,30,40};
		
		
		if(a.length==b.length)
		{
			int cnt=0;
			for(int i=0;i<a.length;i++)
			{
					if(a[i]==b[i])
						cnt++;
			}
				if(cnt==a.length)
					System.out.println("same");
				else
					System.out.println("not same");
		}
		else
			System.out.println("Size not matched");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
