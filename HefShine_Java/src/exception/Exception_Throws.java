package exception;

class ArithmaticExce extends Exception
{
//	public ArithmaticExce(String str)
//	{
//		super(str);
//	}
}

class Operations1
{
	void division(int dividend,int divisor) throws ArithmaticExce
	{
		if(divisor==0)
		{
			throw new ArithmaticExce(/*"by zero"*/);
		}
		else
		{
			System.out.println(dividend/divisor);
		}
	}
}

public class Exception_Throws {

	public static void main(String[] args) throws ArithmaticExce{
		
		Operations1 op=new Operations1();
		//try
		//{
		op.division(12, 0);
		//}
		//catch(ArithmaticExce e)
//		{
//			System.out.println("Handlded");
//		}

	}

}
