package linkedList;

import java.util.LinkedList;

public class SubList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<>();		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list.subList(1,list.size()));

	}

}
