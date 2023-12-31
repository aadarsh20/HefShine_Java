package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_to_arrayList {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		//there have two ways to convert
		//1st
		ArrayList<Integer> al=new ArrayList<>(list);
		System.out.println(al);
		
		//2nd
		ArrayList<Integer> al2=new ArrayList<>();
		for(int i:list)
		{
			al2.add(i);
		}
		System.out.println(al2);
	} 

}
