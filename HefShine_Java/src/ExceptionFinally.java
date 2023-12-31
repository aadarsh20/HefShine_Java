
public class ExceptionFinally {

	public static void main(String[] args) {
//		int num1=45;
//		int num2=0;
//		try
//		{
//		int res=num1/num2;
//		System.out.println(res);
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("handelled");
//		}
//		finally
//		{
//			System.out.println("bye");
//		}

		
		int a[]= {1,2,3,4,5};

		try
		{
		System.out.println(a[7]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Out of bond");
		}
	}

}
