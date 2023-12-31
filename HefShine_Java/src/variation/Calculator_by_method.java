package variation;

import java.util.Arrays;

public class Calculator_by_method {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		int[] a=calc(num1,num2);
		System.out.println("Sum : "+a[0]);
		System.out.println("Sub : "+a[1]);
		System.out.println("Mult : "+a[2]);
		System.out.println("Div : "+a[3]);
		
//		for(int i=0;i<res.length;i++)
//		{
//			System.out.println(res[i]);
//		}

	}

	private static int[] calc(int num1, int num2) 
	{
		int sum=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		
		int a[]= {sum,sub,mult,div};
		return a;
	}

}
