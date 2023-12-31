package arrayList;

import java.util.ArrayList;

public class Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		// remove using index
		al.remove(1);
		System.out.println(al);
		
		//remove using object for object we convert into wrapper class
		Integer data=40;
		al.remove(data);
		System.out.println(al);

	}

}
