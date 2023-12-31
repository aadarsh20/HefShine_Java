package arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
	
		//1st way
		ArrayList<Integer> al2=new ArrayList<>(al);
		System.out.println(al2);

		
		//2nd way
		ArrayList<Integer> al3=new ArrayList<>();
		al3.add(13);
		al3.add(4);
		al3.add(364);
		al3.add(445);
		al3.add(56);
	
		Collections.copy(al3, al);
		System.out.println(al3);
		
		// reverse
		Collections.reverse(al3);
		System.out.println(al3);
	}

}
