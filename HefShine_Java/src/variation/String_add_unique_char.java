package variation;

import java.util.ArrayList;
import java.util.Collections;

public class String_add_unique_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="geeksforgeeks";
		String s2="geeksquiz";
		
		ArrayList<Character> al=new ArrayList<>();
		
		for(int i=0;i<s1.length();i++)
		{
			int cnt=0;
			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
					cnt++;
			}
			if(cnt==0)
				al.add(s1.charAt(i));
		}
		
		for(int i=0;i<s2.length();i++)
		{
			int cnt=0;
			for(int j=0;j<s1.length();j++)
			{
				if(s2.charAt(i)==s1.charAt(j))
					cnt++;
			}
			if(cnt==0)
				al.add(s2.charAt(i));
		}
		Collections.sort(al);
		System.out.println(al);

		
//		String s1="geeksforgeeks";
//		String s2="geeksquiz";
//		String s3=s1+s2;
//		
//		for(int i=s3.length()-1;i>=0;i--)
//		{
//			int cnt=0;
//			for(int j=i-1;j>=0;j--)
//			{
//				if(s3.charAt(i)==s3.charAt(j))
//					cnt++;
//			}
//			if(cnt==0)
//				System.out.println(s3.charAt(i));
		}
	}

