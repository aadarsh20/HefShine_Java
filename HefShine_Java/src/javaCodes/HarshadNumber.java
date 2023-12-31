package javaCodes;

public class HarshadNumber {

	public static void main(String[] args) {
		int num=81;
		int tempNum=num;
		System.out.println("Number is : "+num);
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Sum of number is : "+sum);
		if(tempNum%sum==0)
		{
			System.out.println("Harshad Number");
		}
		else
			System.out.println("Not a harshad number");

	}

}
