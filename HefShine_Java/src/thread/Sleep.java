package thread;

public class Sleep extends Thread{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("hello "+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		
		Sleep s1=new Sleep();
		s1.start();
		
		Sleep s2=new Sleep();
		s2.start();
		
		for(int i=1;i<=5;i++)
		{
		System.out.println("hello "+Thread.currentThread().getName());
		}

	}

}
