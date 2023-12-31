package variation;

public class CountOccursOfVariable {

	public static void main(String[] args) {
		
		
		int a[]= {0,2,2,1,3,1};

		int k=2;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			int cnt=0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j])
					cnt++;
			}
			if(cnt==k)
			{
				if(a[i]<min)
					min=a[i];
			}
		}
		System.out.println(min);
	}
}
