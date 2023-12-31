package thread;

//join();l
/*Waits for this thread to terminate. 
An invocation of this method behaves in exactly the sameway as the invocation */

class Join extends Thread
{
	@Override
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println("catched...");
		}
		for (int i = 0; i < 5; i++) {
			
			System.out.println(Thread.currentThread().getName());
		}
	}
}
public class Join_Method {

	public static void main(String[] args) throws InterruptedException 
	{
		Join Thread1=new Join();
		Thread1.setName("Thread 1");
		
		Join Thread2=new Join();
		Thread2.setName("Thread 2");
		
		Join Thread3=new Join();
		Thread3.setName("Thread 3");
		
		Thread1.start();
		Thread1.join();
		
		Thread2.start();
		Thread2.join();
		
		Thread3.start();
	}

}
