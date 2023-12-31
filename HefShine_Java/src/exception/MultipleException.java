package exception;

public class MultipleException {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};
		try
		{
		int res=12/0;
		System.out.println(res);
		System.out.println(a[5]);
		}
		//using single catch block
//		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("handeled");
//		}
		
		//using multiple catch block
		catch(ArithmeticException e)
		{
			System.out.println("handled 1");
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("handled");
		}

	}

}
