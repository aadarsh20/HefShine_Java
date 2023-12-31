package queue;

import java.util.*;

public class Priority_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);


		System.out.println("iterate using iterator");
		Iterator<Integer> it1=pq.iterator();
		while(it1.hasNext()==true)
		{
			System.out.print(it1.next()+" ");
		}
		
		System.out.println();
		System.out.println("convert queue to array");
		Object a[]=pq.toArray();
		System.out.println(Arrays.toString(a));
		
		System.out.println("retrieve element");
		System.out.println(pq.element());
		
		PriorityQueue<Integer> pq2=new PriorityQueue<>();
		pq2.add(10);
		pq2.add(20);
		
		System.out.println("check equals");
		System.out.println(pq.equals(pq2));
		
		System.out.println("count number of element");
		System.out.println(pq.size());
		
		System.out.println("remove all the element");
		pq.clear();
		System.out.println(pq);
		
		System.out.println("insert element in queue using offer");
		pq.offer(50);
		System.out.println(pq);
		
		System.out.println("create another queue");
		PriorityQueue<Integer> pq1=new PriorityQueue<>(pq);
		System.out.println(pq1);
		
		System.out.println("using for-each loop");
		for(int i:pq)
		{
			System.out.print(i+" "+"\n");
		}
	
		System.out.println("Cretae a priority queue");
		System.out.println(pq);
		

	}

}
