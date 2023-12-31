package arrayList;

import java.util.ArrayList;

public class Create_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println(list.get(i));
		}
		
		

	}

}
