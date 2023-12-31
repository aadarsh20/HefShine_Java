package arrayList;

import java.util.ArrayList;

public class Convert_array_to_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6};
		
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			al.add(a[i]);
		}
		System.out.println(al);

	}

}
