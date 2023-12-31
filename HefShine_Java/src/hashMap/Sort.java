package hashMap;

import java.util.*;

public class Sort {
	public static void main(String[] args) {
		TreeSet<String> tm=new TreeSet<>();
		tm.add("a");
		tm.add("b");
		tm.add("s");
		tm.add("f");
		System.out.println(tm.floor("z"));
		
		System.out.println(tm.lower("z"));
		
		TreeSet<String> tm1=new TreeSet<>();
		tm1.add("a");
		tm1.add("a");
		tm1.add("f");
		tm1.add("i");
		tm.retainAll(tm1);
		System.out.println(tm);
	}
}
