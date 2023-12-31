package set;

import java.util.HashSet;
import java.util.TreeSet;

import javax.swing.table.TableStringConverter;

public class Uniq_pair {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {1,2,3,1};
		TreeSet <Integer> hs=new TreeSet<>();
		for(int i:a)
		{
			hs.add(i);
		}
		for(int i:hs)
		{
			for(int j:hs)
			{
				System.out.println(i+" "+j);
			}
		}

	}
	

}
