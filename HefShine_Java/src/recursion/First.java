package recursion;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		//for(int i=1;i<=5;i++)
		call(num--);

	}
	static void call(int n)
	{
		System.out.println(n);
		call(n);
	}

}
