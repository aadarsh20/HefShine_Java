package variation;

public class Sphenic_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=42;
		
		for(int i=1;i<=num;i++)
		{
			int cnt=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					cnt++;
			}
			if(cnt==2)
				System.out.println(i);
		}

	}

}
