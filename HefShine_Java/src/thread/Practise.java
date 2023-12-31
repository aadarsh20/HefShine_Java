package thread;

class multi extends Thread
{
	public void run()
	{
		System.out.println("running");
	}
}
class multi1 extends Thread
{
	public void run()
	{
		System.out.println("running m1");
	}
}
public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		multi m= new multi ();
		m.run();
		multi1 m1=new multi1();
		m1.run();

	}

}
