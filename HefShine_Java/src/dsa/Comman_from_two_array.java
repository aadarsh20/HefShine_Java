package dsa;

public class Comman_from_two_array {

	public static void main(String[] args) {
		int a[]= {4,3,7,9,2,1};
		int b[]= {5,1,4,8,3};
		
		for(int i=0;i<a.length;i++)
		{
			int cnt=0;
			for (int j = 0; j < b.length; j++) 
			{
				if(a[i]==b[j])
					cnt++;
			}
			if(cnt>=1)
				System.out.println(a[i]);
		}

	}

}
