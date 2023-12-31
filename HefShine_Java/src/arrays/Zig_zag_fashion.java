package arrays;

import java.util.Arrays;

public class Zig_zag_fashion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="fdfs";
		String s2="hfd";
		String s3=s1+s2;
		String s4="";
		char ch[]=s3.toCharArray();
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=ch[i+1])
				s4+=(Object)ch[i];
		}
		//System.out.println(Arrays.toString(ch));
		
		//System.out.println(s3);
//				N = 7
//				Arr[] = {4, 3, 7, 8, 6, 2, 1}
//				Output: 3 7 4 8 2 6 1
//				Explanation: 3 < 7 > 4 < 8 > 2 < 6 > 1
		
//		int a[] = {4, 3, 7, 8, 6, 2, 1};
//		for(int i=1;i<a.length-1;i++)
//		{
//			if(a[i]<a[i-1] && a[i]>a[i+1])
//				continue;
//			else
//			{
//				int temp=a[i];
//				a[i]=a[i-1];
//				a[i-1]=temp;
//			}
//		}
//		System.out.println(Arrays.toString(a));

	}

}
