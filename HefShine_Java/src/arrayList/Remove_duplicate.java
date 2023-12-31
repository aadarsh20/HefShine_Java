package arrayList;

import java.util.ArrayList;

public class Remove_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,4,1,3,2,4,1,5};
		
		ArrayList<Integer> al=new ArrayList<>();
		for (int i:a) 
		{
			if(al.contains(i)==false)
				al.add(i);
		}
		System.out.println(al);

	}

}
