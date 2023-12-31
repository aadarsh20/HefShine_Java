package method;

public class Student 
{
	int rollNo;
	String name;
	void data(int rollNo,String name)
	{
		this.rollNo=rollNo;
		this.name="aadarsh";
		System.out.println("Calling from data..."+rollNo+" "+name);
	}
	void meth(int rollNo,String name)
	{
		this.rollNo=rollNo;
		this.name=name;
		System.out.println("Calling from meth..."+rollNo+" "+name);
	}

	public static void main(String[] args) 
	{

	}

}
