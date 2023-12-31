package javaCodes;

public class Method {
	
	/* 1) First type is no return-type and no argument
	static void sum()
	{
		int a=3;
		int b=4;
		System.out.println(a+b);
		System.out.println(a*b);
	}*/
	
	
	
	/* 2) Second type is no return-tupe but argument
	static void sum(int a, int b)
	{
		System.out.println(a+b);
		System.out.println(a*b);
	}*/
	
	
	/* 3) Third type is no argument but return-type
	static int sum()
	{
		int a=2;
		int b=3;
		return a+b;
	}*/
	
	
	/* 4) Fourth type is argument and return type
	static int sum(int a, int b)
	{
		return a+b;
	}*/
	
	

	
	

	public static void main(String[] args) {
		
		Method m1=new Method();
		//1st type  ==>  sum();
		//2nd type  ==>  sum(3,4);
		//3rd type  ==>  System.out.println(sum());
		//4th type  ==>  System.out.println(sum(2,3));
		
		

	}

}
