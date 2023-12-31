package set;

import java.util.*;;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(1);
		ts.add(8);
		ts.add(4);
		ts.add(3);
		
		System.out.println("Reverse treeSet using Arraylist");		
		ArrayList<Integer> al=new ArrayList<>(ts);
		Collections.reverse(al);
		System.out.println(al);
		System.out.println("Reverse treeSet using Iterator");
		Iterator<Integer> it=ts.descendingIterator();
		while(it.hasNext()==true)
		{
			System.out.print(it.next()+" ");
		}
		
		HashSet<Integer> ts2=new HashSet<>();
		ts2.add(1);
		ts2.add(8);
		ts2.add(4);
		ts2.add(3);
		
		System.out.println("equals are not");
		System.out.println(ts.equals(ts2));
		
		System.out.println("remove all elements");
		ts.clear();
		System.out.println(ts);
		
		System.out.println("size of treeSet");
		System.out.println(ts.size());
		
		System.out.println("empty or not");
		System.out.println(ts.isEmpty());
		
		System.out.println("clone to hashSet");
		HashSet<Integer> clone=(HashSet<Integer>) ts.clone();
		System.out.println(clone);
		
		System.out.println("hashSet to TreeSet");
		TreeSet<Integer> ts1=new TreeSet<>(ts);
		System.out.println(ts1);
		
		System.out.println("HashSet to array");
		Object[] a= ts.toArray();
		System.out.println(Arrays.toString(a));
	}

}
