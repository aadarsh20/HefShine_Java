package practise_OOPS;

interface Int2
{
	void m2();
	
}
interface Int3 extends Int2,Int1
{
	void m3();
}

public interface Int1 {
	void m1();
	
	class Interface implements Int3
	{

		@Override
		public void m2() 
		{
			System.out.println("Calling m2...");
		}

		@Override
		public void m1() 
		{
			System.out.println("Calling m1...");
		}

		@Override
		public void m3() 
		{
			System.out.println("Calling m3...");
		}
	}

	public static void main(String[] args) {
	
		Interface in=new Interface();
		in.m1();
		in.m2();
		in.m3();
	}
}
