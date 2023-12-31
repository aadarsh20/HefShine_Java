package dsa;

public class SubsetOfAnotherArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8};
		int b[]= {2,4,6,7,9};
		
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(b[j]==a[i])
					cnt++;
			}
		}
		if(cnt==0)
			System.out.println("all elements are not present ");
		else
			System.out.println("present");

	}

}
