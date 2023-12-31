

package exception;

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String message)
	{
		super(message);
	}
}
class UserRegistration
{
	void register(int age)
	{
		if(age<18)
		{
			try
			{
				throw new InvalidAgeException("User is a minor");
			}
			catch (InvalidAgeException e) 
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("succesfully");
		}
	}
}
public class ExceptionThrow {

	public static void main(String[] args) {
		
		UserRegistration user=new UserRegistration();
		user.register(16);
	}

}
