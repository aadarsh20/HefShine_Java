package oops;

class Res
{
	void a()
	{
		System.out.println("hello a");
	}
	 
	int b(int a)
	{
		System.out.println("hello b");
		return a;
	}
	
	void c(int a,int b)
	{
		System.out.println("hello c");
	}
	
	
}
public class Gto {

	public static void main(String[] args) {
		
		Res a1=new Res();
		a1.a();
		a1.b(3);
		a1.c(2, 4);

	}

}
