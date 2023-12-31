package linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<>();		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(20);
		
		LinkedList<Integer> list2=new LinkedList<>();		
		list2.add(10);
		list2.add(20);
		
		System.out.println("copy ont to anothe mean clone");
		Object obj=list.clone();
		System.out.println(obj);
		
		System.out.println("get first element");
		int get=list.getFirst();
		System.out.println(get);
		
		System.out.println("get last element");
		int last=list.getLast();
		System.out.println(last);
		
		System.out.println("remove and print first element");
		list.poll();
		System.out.println(list);
		
		System.out.println("remove index");
		list.remove(3);
		System.out.println(list);
		
		System.out.println("remove object");
		list.remove((Integer)20);
		
		System.out.println("remove first and last");
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
				
		
		System.out.println("clear");
		list.clear();
		System.out.println(list);
		
		System.out.println("shuffle");
		Collections.shuffle(list);
		System.out.println(list);
		
		System.out.println("add all");
		list.addAll(list2);
		System.out.println(list);
		
		System.out.println("index and element");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i)+" "+i);
		}
		
		System.out.println("first and last occurance");
		System.out.println(list.indexOf(20));
		System.out.println(list.lastIndexOf(20));
		
		System.out.println("add first and last");
		list.addFirst(9);
		list.addLast(39);
		System.out.println(list);
		
		System.out.println("add at spacific index");
		list.add(2,100);
		System.out.println(list);

	}

}
