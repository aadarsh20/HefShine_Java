package javaCodes;

public class Swap {

	public static void main(String[] args) {
		
		//there have two ways to swap
		//1st
//		System.out.println("beforre swaping");
//		int a=2;
//		int b=3;
//		System.out.println(a);
//		System.out.println(b);
//		int temp=a;
//		a=b;
//		b=temp;
//		System.out.println("after swaping");
//		System.out.println(a);
//		System.out.println(b);

//		2nd
		System.out.println("beforre swaping");
		int a=2;
		int b=3;
		System.out.println(a);
		System.out.println(b);
		a=a+b; //a=5
		b=a-b; //b=2
		a=a-b;
		System.out.println("After swapping");
		System.out.println(a);
		System.out.println(b);
		
	}

}
