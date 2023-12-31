package dsa;

public class MaidenTwoArray {

	public static void main(String[] args) {
		
		int a[]= {1,3,5};
		int b[]= {2,4,6};
		
		int Asum=0;
		for(int i=0;i<a.length;i++)
		{
			Asum=a[i]+Asum;
		}
		//System.out.println(Asum);
		
		int bsum=0;
		for(int i=0;i<b.length;i++)
		{
			bsum=b[i]+bsum;
		}
		
	//	System.out.println((a.length+b.length));
		int median=(Asum+bsum)/(a.length+b.length);
		System.out.println((float)median);

	}

}
