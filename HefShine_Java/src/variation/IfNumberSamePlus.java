package variation;

public class IfNumberSamePlus {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,8};
		int b=2;	
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b)
				b+=a[i];
		}
		System.out.println(b);
	}
}
