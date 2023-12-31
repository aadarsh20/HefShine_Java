package smart_programming;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist_to_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		int a[]=new int[al.size()];
		int index=0;
		for (Integer integer : al) 
		{
			a[index++]=integer;
		}
		System.out.println(Arrays.toString(a));

	}

}
