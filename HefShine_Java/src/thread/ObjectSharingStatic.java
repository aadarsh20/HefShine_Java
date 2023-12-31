package thread;

class Test1
{
	synchronized static void display()    //synchronized used for it run only for one thread after completing one thread it gives task to another method
	{
	for(int i=1;i<=5;i++)
	{
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	}
	}
}
class Thread3 extends Thread 
{
	@Override
	public void run() 
	{
		Test1.display();	
	}
}
class Thread4 extends Thread 
{
	@Override
	public void run() 
	{
		Test1.display();
	}
}
public class ObjectSharingStatic {
	public static void main(String[] args) 
	{
		Test1 test=new Test1();
		
		Thread3 t3=new Thread3();
		Thread4 t4=new Thread4();
		t3.start();
		t4.start();
	}
}