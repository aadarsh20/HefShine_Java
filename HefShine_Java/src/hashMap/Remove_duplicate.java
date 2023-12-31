package hashMap;
import java.util.*;
public class Remove_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,1,2,4,3,6,4,3,5,6};
		
		HashMap<Integer, Integer> map=new HashMap<>();

		for(int i=0;i<a.length;i++)
		{
			map.put(a[i], null);
		}
		System.out.println(map.keySet());  //for key
		System.out.println(map.values());  //for values
	}

}
