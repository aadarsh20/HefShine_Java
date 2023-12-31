package oops;

class Aadarsh 
{
   void method()
   {
	   System.out.println("Hello Aadarsh");
   }
}
class Pranay extends Aadarsh
{
	void mathod1()
	{
		System.out.println("Hello Pranay");
	}
}

public class Inheritance extends Pranay {
	void Inher()
	{
		System.out.println("Hello Inher");
	}

	public static void main(String[] args) {
	Inheritance in =new Inheritance();
	in.Inher();

	}

}
