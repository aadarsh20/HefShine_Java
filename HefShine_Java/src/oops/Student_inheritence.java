package oops;

public class Student_inheritence {
	
	void display()
	{
		System.out.println("hello from student inheritence....");
	}
	
	public static class student1 extends Student_inheritence
	{
		void display()
		{
			System.out.println("hello from student 1");
		}
		
		student1()
		{
			System.out.println("my name ");
		}
	}

	public static void main(String[] args) {
		
		
		student1 s1=new student1();
		s1.display();

	}

}
