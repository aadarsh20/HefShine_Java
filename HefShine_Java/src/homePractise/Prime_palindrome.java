package homePractise;

public class Prime_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1,b=10;
		for(int i=a;i<=b;i++)
		{
			int cnt=0;
			int sum=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
					cnt++;
			}
			if(cnt==2)
			{
				int rem=i%10;
				sum=(sum*10)+rem;
				i/=10;
			}
			if(sum==i)
				System.out.println(i);
		}
	}

}
