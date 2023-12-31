package arrays;

public class Second_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {10,10};
		
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				smax=max;
				max=a[i];
			}
			if(a[i]<max && a[i]>smax)
				smax=a[i];
		}
		if(smax==Integer.MIN_VALUE)
			System.out.println(-1);
		else
			System.out.println(smax);
		
//		int max=a[0];
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]>a[i+1])
//				max=a[i];
//		}
//		System.out.println(max);

	}

}
