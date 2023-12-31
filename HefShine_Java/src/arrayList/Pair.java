package arrayList;

import java.util.ArrayList;

public class Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,1};
		ArrayList<Integer> al=new ArrayList<>();
		
		for(int i:a)
		{
			if(al.contains(i)==false)
				al.add(i);
		}
		for(int ele1:al)
		{
			for(int ele2:al)
			{
				System.out.println(ele1+" "+ele2);
			}
		}

	}

}
