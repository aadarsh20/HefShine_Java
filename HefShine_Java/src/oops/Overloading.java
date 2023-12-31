package oops;

public class Overloading {

	void read()
	{
		System.out.println("Rading book");
	}
	void read(String a)
	{
		System.out.println("Reading "+a+" book");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading od=new Overloading();
		od.read();
		od.read("java");

	}

}
