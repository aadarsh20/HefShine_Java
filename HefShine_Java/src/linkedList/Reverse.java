package linkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Reverse {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<>();		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		
		
		//using Iterator
		System.out.println("using iterator");
		Iterator<Integer> it=list.descendingIterator();
		while(it.hasNext())
		{
		System.out.print(it.next()+" ");
		}
		System.out.println();
		
//		using revrese method
		System.out.println("using reverse method");
		Collections.reverse(list);
		System.out.println(list);

	}

}
