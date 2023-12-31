package exception;
class ArithmeticExce extends Exception
{
	public ArithmeticExce(String message)
	{
		super(message);
	}
}
class Operations
{
	void division(int dividend,int divisor)
	{
	if(divisor==0)
	{
		try
		{
			throw new ArithmeticException("/ by zero");
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
	else
	{
		System.out.println(dividend/divisor);
	}
}
}
public class ExceptionThrow2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations op=new Operations();
		op.division(22, 0);
	}
}
