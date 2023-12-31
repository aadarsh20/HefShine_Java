package variation;

public class Triplets_with_0_sum {

	public static void main(String[] args) {
		
		
		int a[]= {0,-1,2,-3,1};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				for (int k = j+1; k < a.length; k++) {
					if(a[k]+a[j]+a[i]==0)
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
				}
			}
		}

	}

}
