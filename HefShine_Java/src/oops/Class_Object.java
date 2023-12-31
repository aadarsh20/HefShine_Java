package oops;

public class Class_Object {

	public static class Student
	{
		String name;
		int rollNo;
		double percentage;
		
		//Create a method
//		void displayInformation()
//		{
//			System.out.println(percentage);
//		}
		
		
		
		
		//create a constructer
		Student(String name,int rollNo,double percentage)
		{
			
		}  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st =new Student("aadarsh",12,69.20);
		System.out.println(st.name+" "+st.rollNo+" "+st.percentage);
		//Student s1=new Student();
		System.out.println();

	}

}
