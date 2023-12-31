package oops;

public class ThisConstructer {
	
	int x,y;
	public ThisConstructer()
	{
		x=23;
		y=34;
		System.out.println(x+" "+y );
	}
	ThisConstructer(int a)
	{
		this();
		x=a;
		System.out.println(x+" "+y);
	}
	ThisConstructer(int a, int b)
	{
		this(a);
		x=a;
		y=b;
		System.out.println(x+" "+y);
	}

	public static void main(String[] args) {
		
		new ThisConstructer(4,5);
		

	}

}
