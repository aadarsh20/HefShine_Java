package variation;

public class Only_once_sortedArray {

	public static void main(String[] args) 
	{
		int a[]= {1,1,1,2,2,4,5,5,6,6};
		
		if(a[0]!=a[1])
			System.out.println(a[0]);
		else if (a[a.length-1]!=a[a.length-2])
			System.out.println(a[a.length-1]);
		else
			for(int i=1;i<a.length-1;i++)
			{
				if(a[i]!=a[i+1] && a[i]!=a[i-1])
					System.out.println(a[i]);
			}
			
	}

} 
