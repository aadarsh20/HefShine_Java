package practise_OOPS;

public class ClassAndObject {

	int a=12; // instance variable
	static int b=15; // static variable 
	
	
	
	// method
//	 void sample(int a,int b)
//	 {
//		 System.out.println(a+b);
//	 }
//	
	
	
	//constructor
	 ClassAndObject(int a) 
	 {
		 System.out.println(a+" hello aadarsh");
	 }
	 
	 
	 public ClassAndObject() 
	 {
		 System.out.println("call from non-para");
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		ClassAndObject co=new ClassAndObject(12);
		int c=13; //local variable
		
		//co.sample(1,2);
		System.out.println(c);
		System.out.println(co.a);
		System.out.println(b);

	}

}
