package exception;


public class PractiseException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4};
		
		try
		{
		System.out.println(a[4]);
		}
		catch(Exception e)
		{
			e.printStackTrace(); //this privode all information of exeption
			//System.out.println("Array is out of bound enter perfect index");
		}

	}

}
