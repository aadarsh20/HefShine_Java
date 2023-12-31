package smart_programming;

import java.util.Arrays;

public class Remove_spacific_ele {

	public static void main(String[] args) 
	{
		int a[]= {10,2,30,10,20,49,20,10};
		int ele=10;
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele)
				cnt++;
		}
		int b[]=new int[a.length-cnt];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=ele)
				b[index++]=a[i];
		}
		System.out.println(Arrays.toString(b));

	}
}
