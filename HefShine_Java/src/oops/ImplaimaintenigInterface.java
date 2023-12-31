package oops;

public abstract class ImplaimaintenigInterface implements Interface2 {

	public static void main(String[] args) {
		ImplaimaintenigInterface im =new ImplaimaintenigInterface() 
		{
		
		};
		im.m1();
		im.m2();
		im.sample();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 calling.....");
	}

	@Override
	public void sample() {
		// TODO Auto-generated method stub
		System.out.println("Sample Calling.....");
	}
}

