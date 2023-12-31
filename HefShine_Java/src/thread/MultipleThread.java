package thread;

public class MultipleThread extends Thread{
	public void run()
	{
		System.out.println("From claas..."+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		MultipleThread m1=new MultipleThread();
		m1.start();
		MultipleThread m2=new MultipleThread();
		m2.start();
		System.out.println("From main method..."+Thread.currentThread().getName());
		

	}

}
