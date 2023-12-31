package arrayList;

import java.util.*;

public class Using_Scanner {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 	Scanner sc=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<>();
		
		while(true)
		{
		System.out.println("Enter number : ");
		int num=sc.nextInt();
		al.add(num);
		System.out.println(al);
		System.out.println("Enter Y for continue : N for break");
		String ch=sc.next();
		if(ch=="Y")
			continue;
		else if(ch=="N")
			break;
	
		}
	}

}
