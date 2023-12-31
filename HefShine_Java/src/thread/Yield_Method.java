package thread;

//yield()
/*A hint to the scheduler that the current thread is willing to yieldits current use of a processor. 
The scheduler is free to ignore thishint.*/ 

class TestYe extends Thread
{
	@Override
	public void run() 
	{
		for (int i = 0; i < 5; i++) 
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class Yield_Method {

	public static void main(String[] args) 
	{
		TestYe thread1=new TestYe();
		thread1.setName("thread 1");
		thread1.start();
		
		TestYe thread2=new TestYe();
		thread2.setName("thread 2");
		thread2.start();
		
		for (int i = 0; i < 5; i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName());
			
		}

	}

}
