package string;

import java.util.Arrays;

public class Reverse_every_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1="you all are good student";
//		String a[]=s1.split(" ");
		
//		int start=0;
//		int end=a.length-1;
//		while(start<=end)
//		{
//			String temp=a[start];
//			a[start]=a[end];
//			a[end]=temp;
//			
//			start++;
//			end--;
//		}
//		String s2="";
//		for(int i=0;i<a.length;i++)
//		{
//			s2+=a[i]+" ";
//		}
//		System.out.println(s2);
//		student good are all you

		
		
		String s1="you all are good student";
		String s2[]=s1.split(" ");
		for(int i=0;i<s2.length;i++)
		{
			String temp=s2[i];
			String s3="";
			for(int j=temp.length()-1;j>=0;j--)
			{
				s3+=temp.charAt(j);
			}
			s2[i]=s3;
		}
		String s4="";
		for(int i=0;i<s2.length;i++)
		{
			s4+=s2[i]+" ";
		}
		System.out.println(s4);
//			int start=0;
//		int end=a.length-1;
//		while(start<=end)
//		{
//			String temp=a[start];
//			a[start]=a[end];
//			a[end]=temp;
//			
//			start++;
//			end--;
//		}
//		String s2="";
//		for(int i=0;i<a.length;i++)
//		{
//			s2+=a[i]+" ";
//		}
//		System.out.println(s2);
	}

}
