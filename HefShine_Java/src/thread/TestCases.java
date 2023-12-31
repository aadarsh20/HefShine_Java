package thread;

public class TestCases extends Thread  {
//	public void run(String s)    // Second case ==> we can overload a run() but it act like normal method
//	{
//		System.out.println("From claas..."+Thread.currentThread().getName());
//	}
	
	public void run()
	{
		System.out.println("From claas..."+Thread.currentThread().getName());
	}

	public static void main(String[] args) {			
			MultipleThread m1=new MultipleThread();
			m1.run();                          // First case ==> we can use run() but it act as a normal method.its not complete his formalities
			MultipleThread m2=new MultipleThread();
			m2.start();
	}

}
