package linkedList;

import java.util.LinkedList;

public class AddLast {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.addLast(60);
		System.out.println(list);
	}

}
