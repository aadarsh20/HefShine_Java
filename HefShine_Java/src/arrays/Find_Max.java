package arrays;

public class Find_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {-1,2,3,4,5,-8};
		int max=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<max)
				max=a[i];
		}
		System.out.println(max);
		//System.out.println(Integer.MIN_VALUE+" "+Integer.MAX_VALUE);

	}

}
