package set;

import java.util.HashSet;

public class Same_in_both_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<>();
		hs.add(1);
		hs.add(6);
		hs.add(3);
		hs.add(5);
		
		HashSet<Integer> hs1=new HashSet<>();
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(5);
		
		//1st way
		for(int i:hs)
		{
			if(hs1.contains(i)==true)
				System.out.println(i);
		}
		
		//2nd way
		hs.retainAll(hs1);
		System.out.println(hs);
		

	}

}
