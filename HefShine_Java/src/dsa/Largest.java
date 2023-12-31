package dsa;

public class Largest {

	public static void main(String[] args) {
		
		
		int a []= {7,3,5,6,8,3};
		
		int first=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>first)
				first=a[i];
		}
		System.out.println(first);

	}

}
