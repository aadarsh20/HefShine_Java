package thread;

class Abcd
{
	synchronized void m1(Abcd abcd2)
	{
		System.out.println(Thread.currentThread().getName()+" in m1()");
		try 
		{
			Thread.sleep(100);
		}
		catch (InterruptedException e) 
		{
			System.out.println("handelled...");
		}
		System.out.println(Thread.currentThread().getName()+" calling m2()");
		abcd2.m2();
	}
	
	synchronized void m2()
	{
		System.out.println(Thread.currentThread().getName()+"in m2()");
	}
	
	class A extends Thread
	{
		Abcd abcd1,abcd2;
		
		A(Abcd abcd1, Abcd abcd2)
		{
			this.abcd1=abcd1;
			this.abcd2=abcd2;
		}
		public void run() 
		{
			abcd1.m1(abcd2);
	}
	}
	
	class B extends Thread
	{
		Abcd abcd1,abcd2;
		
		B(Abcd abcd1, Abcd abcd2)
		{
			this.abcd1=abcd1;
			this.abcd2=abcd2;
		}
		@Override
		public void run() 
		{
			abcd2.m1(abcd1);
		}

	}
}
public class DeadLock {

	public static void main(String[] args) {
		
		Abcd abcd1 = new Abcd();
		Abcd abcd2 = new Abcd();

//		A a = new A(abcd1 , abcd2);
//		B b = new B(abcd1, abcd2);
//		
//		a.start();
//		b.start();
	}

}
