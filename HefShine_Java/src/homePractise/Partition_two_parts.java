package homePractise;

public class Partition_two_parts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,5};
		int max=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>max)
				max=a[i];
		}
		int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]!=max)
				sum+=a[i];
		}
		if(sum==max)
			System.out.println(true);
		else
			System.out.println(false);
//		System.out.println(sum);
//		System.out.println(max);

	}

}
