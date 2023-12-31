package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Loops_for_linkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list=new LinkedList<>();		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		//for loop
		System.out.println("using for loop");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		//for each
		System.out.println("using for each loop");
		for(int i:list)
		{
			System.out.println(i);
		}
		
		//Iterator
		System.out.println("using Iterator");
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()==true)
		{
			System.out.println(it.next());
		}
		
		//while loop
		System.out.println("using while loop");
		int i=0;
		while(i<list.size())
		{
			System.out.println(list.get(i));
			i++;
		}
	}

}
