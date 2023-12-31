package thread;

class Table extends Thread
{
	public void tab(int num) 
	{
		for(int i=1;i<=10;i++)
		{
		System.out.println(i*num);
		}
	}
	
	public void fib()
	{
		int a=0;
		System.out.println(a);
		int b=1;
		System.out.println(b);
		for(int i=1;i<10;i++)
		{
		int c=a+b;
		a=b;
		b=c;
		System.out.println(c);
		}
	}
	@Override
	public void run() {
		tab(12);
		fib();
	}
}
public class Practise_fibon_table {

	public static void main(String[] args) {
		
		System.out.println("table");
		Table t1=new Table();
		t1.start();
		
		System.out.println("fibonancy seties");
		Table t2=new Table();
		t2.start();
		
		

	}

}
