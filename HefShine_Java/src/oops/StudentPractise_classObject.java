package oops;

import java.awt.DisplayMode;

public class StudentPractise_classObject {
	
	public static class Student
	{
		String name;
		int rollNo;
		
		void DisplayInfo(String name,int rollNo)
		{
			System.out.println(name+" "+rollNo);
		}
		
		Student(String name,int rollNo)
		{
			System.out.println(name+" "+rollNo);
		}
	}
	public static void main(String[] args) {
		Student st=new Student("aadarsh",1);
		st.DisplayInfo("aadarsh",2);
		

		
	}

}
