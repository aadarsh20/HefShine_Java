

//class B extends A
//{
//	String b="aadarsh";
//	
//	static  void bmeth(String a,String b)
//	{
//		System.out.println(a+" "+b);
//	}
//}
//
//public class A {
//	String a="heelo";
//	
//	static void bmeth()
//	{
//		System.out.println("from overriding");
//	}
//	
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
// 
//		B b1 =new B();
//		//b1.bmeth();
//		//b1.bmeth();
//		//bmeth();
		

package practise_OOPS;

class B 
{
	int a=135;
	void Bmeth()
	{
		System.out.println("from class B...");
	}
}

public class A extends B
{
	void Ameth()
	{
		//super.a;
		super.Bmeth();
		int rer=12;
		System.out.println("from class A...");
	}
	public static void main(String[] args) {
	 
		A a1=new A();
		a1.Ameth();
		
		
	}

}

