package variation;

import java.util.Arrays;

public class Newman_conway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int a[]=new int[n+1];
		a[1]=1;
		a[2]=1;

		for(int i=3;i<a.length;i++)
		{
			a[i]=a[a[i-1]]+a[i-a[i-1]];
		}
		System.out.println(Arrays.toString(a));
	}

}
