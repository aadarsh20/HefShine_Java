package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Swap_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student("somu" , 1 , 80));
		al.add(new Student("gomu" , 2 , 20));
		al.add(new Student("tomu" , 3 , 40));
		al.add(new Student("somya" , 4 , 50));

		//using Interface of comparable
		Collections.sort(al);
		
		//using logic
		/*for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i).marks>al.get(j).marks)
				{
					Student temp=al.get(i);
					al.set(i, al.get(i));
					al.set(j, temp);
				}
			}
		}*/
		System.out.println(al);
	}
}
class Student implements Comparable<Student>
	{
		String name;
		int rn;
		int marks;
		
		
		public Student(String name, int rn, int marks) 
		{
			this.name = name;
			this.rn = rn;
			this.marks = marks;
		}


		@Override
		public String toString() 
		{
			return "Student [name=" + name + ", rn=" + rn + ", marks=" + marks + "]";
		}


		@Override
		public int compareTo(Student o) 
		{
			if(this.marks>o.marks)
				return 1;
			else if(this.marks<o.marks)
				return -1;
			else
				return 0;
		}
		
		
	}

