package dsa;

public class LinearSearch {

	public static void main(String[] args) {

		int a[]= {5,6,8,4,8,0};
		int ele=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele)
				System.out.println("find at index : "+i);
		}
	}

}
