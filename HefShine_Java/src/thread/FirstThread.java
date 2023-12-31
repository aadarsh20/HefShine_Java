package thread;

public class FirstThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Thread1 : "+Thread.currentThread().getName());
		}
	}
//	public void run(String n1)
//	{
//		for(int i=1;i<=5;i++)
//		{
//			System.out.println("Thread2 : "+Thread.currentThread().getName());
//		}
//	}
//	public void run(int n1)
//	{
//		for(int i=1;i<=5;i++)
//		{
//			System.out.println("Thread3 : "+Thread.currentThread().getName());
//		}
//	}
//	public void run(String n1,String n2)
//	{
//		for(int i=1;i<=5;i++)
//		{
//			System.out.println("Thread4 : "+Thread.currentThread().getName());
//		}
//	}
	
	public static void main(String[] args) 
	{
		FirstThread f1=new FirstThread();
		f1.start();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("khade : "+Thread.currentThread().getName());
		}
		
		
	}
}
