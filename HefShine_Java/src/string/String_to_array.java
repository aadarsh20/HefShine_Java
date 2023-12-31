package string;

import java.util.Arrays;

public class String_to_array {

	public static void main(String[] args) {
		
		String s1="hefShine";		
		
		//str(s1,ch);
		//System.out.println(Arrays.toString());
		
	}

	private static void str(String s1, char[] ch) 
	{
		for(int i=0;i<s1.length();i++)
		{
			ch[i]=s1.charAt(i);
		}
		//return ch[];
		
	} 
//		String s1="hefShine";
//		
//		char ch[]= new char[s1.length()];
//
//		for(int i=0;i<s1.length();i++)
//		{
//			ch[i]=s1.charAt(i);
//		}
//		System.out.println(Arrays.toString(ch));

}
