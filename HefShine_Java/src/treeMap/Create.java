package treeMap;

import java.util.TreeMap;

public class Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> tm=new TreeMap<>();
		tm.put(1, "aadarsh");
		tm.put(2, "shubham");
		tm.put(5, "suraj");
		tm.put(4, "sahil");

		System.out.println(tm.keySet());
	}

}
