package arrays;

public class SubArrayAvgAndIndex {

	public static void main(String[] args) {
		
		
		int a[]= {3,7,90,20,5,50,40};
		int min=Integer.MAX_VALUE;
		int startIndex=-1;
		for (int i = 0; i <= a.length-3; i++) 
		{
			int sum=0;
			for (int j = i; j < i+3; j++) 
			{
				sum=sum+a[j];
			}
			int avg=sum/3;
			if(avg<min)
			{
				min=avg;
				startIndex=i;
			}
		}
		System.out.println("Minimum avg of subarrat : "+min);
		System.out.println("Index of starting subArray : "+startIndex);
	}

}
