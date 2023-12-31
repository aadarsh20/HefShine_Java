package practise_OOPS;
abstract class A1
{
	A1()
	{
		System.out.println("Hello");
	}
	int no;
	abstract void m1();
	void m2()
	{
		System.out.println("non Abstract method");
	}
}
class B1 extends A1
{
	B1()
	{
		System.out.println("B1 constructor");
	}
	int no=1;
	void m1()
	{
		System.out.println("abstarct method");
	}
}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B1 b=new B1();
		b.no=11;
		b.m1();
		b.m2();
		
	}

}
