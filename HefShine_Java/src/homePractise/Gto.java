package homePractise;

import java.util.LinkedList;

public class Gto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="12345";
		System.out.println(s1.charAt(s1.length()-1));
		if(s1.charAt(s1.length()-1)=='0' || s1.charAt(s1.length()-1)=='5')
		{
			System.out.println("yes");
		}
		else
			System.out.println("no");
//		String s1=new String("121");
//		int d=Integer.parseInt(s1,2);
//		System.out.println(d);
		//int a=3;
		//int b=4;
		//System.out.println("hai"+a+b);
		/*LinkedList list=new LinkedList<>();		
		list.add("a");
		list.add("b");
		
		String a[]= {"a","b"};
		String s2="";
		for(String ele:a)
		{
			s2+=ele;
		}
		System.out.println(s2);*/
	}

}
