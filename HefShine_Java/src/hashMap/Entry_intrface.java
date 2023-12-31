package hashMap;


import java.util.*;
import java.util.Map.Entry;

public class Entry_intrface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hs=new HashMap<>();
		hs.put(1,1);
		hs.put(2,2);
		hs.put(4,4);
		hs.put(5,5);

		Set<Entry<Integer, Integer>> ent=hs.entrySet();
		System.out.println(ent);
	}

}
