package arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sort_Shuffle_contains {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		//sort logic
		
		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i)>al.get(j))
				{
					int temp=al.get(i);
					al.set(i, al.get(i));
					al.set(j, temp);
				}
			}
		}
		System.out.println(al);
		
		//sort
		Collections.sort(al);
		System.out.println(al);
		
		//shuffle
		Collections.shuffle(al);
		System.out.println(al);
		
		//contains
		System.out.println(al.contains(3));
	}
}
