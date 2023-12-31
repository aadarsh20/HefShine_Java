package oops;

final class Ac
{
	//final Ac()
	{
		
	}
	void display1()
	{
		System.out.println("display1 method calling....");
	}
}

class Ab //extends Ac   // 3) Ac class can not extend cause it final
{
	final void display() 
	{
		System.out.println("method calling...");
	}
}
public class Final_Keyword {

	public static void main(String[] args) {
		
		// 2) When we call a method it will run but not reinitilized
		Ab a1=new Ab();
		a1.display();
		
//		// 1) for final variable
//		final int num=12;
//		//num=1;    it gives error because we cant reinitilized a variable
//		System.out.println(num);

	}

}
