package variation;

public class Number_is_1 {

	private static int sum(int num) 
	{
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum+=rem;
			num/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		
		int num=12345;
		while(num>9)
			
		{
		num=sum(num);
		}
		System.out.println(num);
		

	}

}
