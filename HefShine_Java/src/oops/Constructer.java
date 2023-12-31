package oops;

public class Constructer {
	int a,b;
	Constructer(int a, int b)
	{
		//a=2;
		//b=3;
		System.out.println(a+b);
	}
	Constructer(int x, int y, int z)
	{
		this(2, 4);
		System.out.println(x+y+z);
		System.out.println(x*y*z);
	}

	public static void main(String[] args) {
		//Constructer c1=new Constructer();
		Constructer c2=new Constructer(4,2,3);

	}

}
