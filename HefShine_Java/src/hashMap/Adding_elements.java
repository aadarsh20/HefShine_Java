package hashMap;

import java.util.*;

public class Adding_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1, "somu");
		hm.put(2, "gomu");
		hm.put(3, "tomu");

		Set<Integer> set=hm.keySet();
		for(int i:set)
		{
			System.out.println(i);
		}
		for(int i=1;i<=hm.size();i++)
		{
			System.out.print(i+" :- "+hm.get(i)+", ");
		}
		System.out.println();
		System.out.println(hm);
	}

}
