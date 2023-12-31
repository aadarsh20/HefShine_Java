package arrays;

import java.util.TreeSet;

public class SubSet_Another_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a[]= {1, 2, 3, 4, 5, 6, 7, 8};
		long b[]= {1, 2, 3, 1};
		 TreeSet<Long> al=new TreeSet<>();
	        TreeSet<Long> al2=new TreeSet<>();
	        for(long i:a)
	        {
	            al.add(i);
	        }
	        for(long i:b)
	        {
	            al2.add(i);
	        }
	        System.out.println(al+" "+al2);
	        if(al.size()>=al2.size())
	        {
	            int cnt=0;
	            for(long i:al2)
	            {
	                if(al.contains(i)==true)
	                {
	                cnt++;
	                al.remove(i);
	                }
	                System.out.println(al);
	            }
	            System.out.println(cnt+" "+al2.size());
	            if(cnt==al2.size())
	            	System.out.println("yes");
	            else
	            System.out.println("no");
	        }
	        else
	        System.out.println("no");

	}

}
