package string;

import java.util.Arrays;

public class Sort_String {

	public static void main(String[] args) 
	{
//		String s1="51342";
//		char a[]=s1.toCharArray();
//		char ans[]=sort(a);
//		System.out.println(ans);
//	}
//	private static char[] sort(char a[]) 
//	{
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]>a[j])
//				{
//					char temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
//		return a;	
		
		
		String s1="welcome to hef";
		String sa[]=s1.split(" ");
		
		for(int i=0;i<sa.length;i++)
		{
			for(int j=i+1;j<sa.length;j++)
			{
				if(sa[i].length()>sa[j].length())
				{
					String temp=sa[i];
					sa[i]=sa[j];
					sa[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(sa));
	}
}
