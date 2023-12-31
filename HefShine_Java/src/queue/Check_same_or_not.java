package queue;

import java.util.PriorityQueue;

public class Check_same_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("a");
		pq.add("a");
		pq.add("a");
		pq.add("a");
		
		PriorityQueue<String> pq1=new PriorityQueue<>();
		pq1.add("a");
		pq1.add("a");
		pq1.add("a");
		pq1.add("a");
		
		int cnt=0;
		for(String i:pq)
		{
			if(pq1.contains(i)==true)
				cnt++;
		}
		if(cnt==pq.size())
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
