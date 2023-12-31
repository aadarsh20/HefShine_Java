package string;

import java.util.Arrays;

public class Dictionary_sort {

	public static void main(String[] args) {
		
		String s1="hello aadarsh welcome to hefshine ";
		String a[]=s1.split(" ");
		for (int i = 0; i < a.length; i++) 
		{
			for (int j =i+1; j < a.length; j++) 
			{
				if(a[i].compareTo(a[j])>0)
				{
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
