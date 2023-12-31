package hashMap;

import java.util.HashMap;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Integer> hm=new HashMap<>();
		hm.put(1, 1);
		hm.put(2, 2);
		hm.put(3, 3);
		hm.put(4, 4);
		
		//isEmpty
		System.out.println("check map is emty or not");
		System.out.println(hm.isEmpty());
		
		//containsKey
		System.out.println("check key is present or not");
		System.out.println(hm.containsKey(1));
		
		//containsValue
		System.out.println("check value is present or not");
		System.out.println(hm.containsValue(1));
		
		//put
		System.out.println("it replace a value");
		hm.put(1, 10);
		System.out.println(hm);
		
	}

}
