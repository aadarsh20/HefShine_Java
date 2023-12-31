package variation;

public class Krishnumarti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=145;
		int n1=n;
		int sum=0;
		while(n1>0)
		{
			int rem=n1%10;
			sum+=fact(rem);
			n1/=10;
		}
		if(sum==n)
			System.out.println("krushnamurti number");
		else
			System.out.println("not krushnamurti num");

	}

	private static int fact(int rem) {
		int sum=1;
		for(int i=1;i<=rem;i++)
		{
			sum*=i;
		}
		return sum;
		
	}

}
