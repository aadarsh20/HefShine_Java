package thread;



class Test
{
	synchronized void display()    //synchronized used for it run only for one thread after completing one thread it gives task to another method
	{
	for(int i=1;i<=5;i++)
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	}
	}
}
class Thread1 extends Thread 
{
	Test test;
	Thread1(Test test)
	{
		this.test=test;
	}
	@Override
	public void run() 
	{
		test.display();
		
	}
}

class Thread2 extends Thread 
{
	Test test;
	Thread2(Test test)
	{
		this.test=test;
	}
	@Override
	public void run() 
	{
		test.display();
	}
}
public class ObjectSharing {

	public static void main(String[] args) 
	{
		Test test=new Test();
		
		Thread1 t1=new Thread1(test);
		Thread2 t2=new Thread2(test);
		t1.start();
		t2.start();
		
	}

}
