package exception;

public class ArithamticExcep {

	public static void main(String[] args) {

		int num1 = 34;
		int num2 = 0;

		int res = 0;
		try 
		{
			res = num1 / num2;
		}
		catch (Exception e) 
		{
			System.out.println("Infinite");
		}
		System.out.println(res);
//		

//		int a[]= {1,2,3,4};
//		System.out.println(a[5]);	
	}

}
