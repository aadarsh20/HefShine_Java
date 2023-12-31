package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Get_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> ar=new ArrayList<>();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		ar.add(0,9);   //add(index, element) it add element at position
		
		System.out.println(ar);  // get() it will print in bracket
		
		//iterator 
		Iterator<Integer> it=ar.iterator();
		while(it.hasNext()==true)
		{
			System.out.println(it.next());
		}
		
		//for each loop
		for(int num:ar)
		{
			System.out.println(num);
		}
		
		//while loop
		int i=0;
		while(i<=ar.size())
		{
			System.out.println(ar.get(i));
			i++;
		}
		for(int j=0;j<ar.size();j++)
		{
			System.out.println(ar.get(j));
		}
		
	}

}
