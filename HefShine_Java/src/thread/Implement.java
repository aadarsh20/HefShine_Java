package thread;

//when we want inherite

public class Implement implements Runnable
{
	@Override
	public void run() 
	{
		for(int i=1;i<=5;i++)	
		{
			System.out.println("hello from class.."+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) 
	{
		Implement im=new Implement(); //thrad 0.it call run method and w keywordcan create multiple thread using new 
		Thread t1=new Thread(im);
		t1.start();
		
		for(int i=1;i<=5;i++)	// main thread
		{
			System.out.println("hello from main.."+Thread.currentThread().getName());
		}
		
	}



}
