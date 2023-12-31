package set;

import java.util.HashSet;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* hashSet is similar as map but it not store values in 
		key and value pair. it store it only key value.and it not support duplicate value*/  
		HashSet<Integer> hs=new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(4);
		hs.add(5);

	
		hs.add(5);
		System.out.println(hs);
	}

}
