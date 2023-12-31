package dsa;

public class PeakElement {

	public static void main(String[] args) {

		int a[]= {5,6,3,7,9};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<i+1;j++)
			{
				if(a[j]<a[i])
					System.out.println(a[i]);
			}
		}
	}

}
