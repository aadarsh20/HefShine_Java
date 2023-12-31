package pattern;

import java.util.ArrayList;

public class Snake_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}};

		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<a[i].length;j++)
				{
					al.add(a[i][j]);
				}
			}
			if(i%2!=0)
			{
				for(int j=a[i].length-1;j>=0;j--)
				{
					al.add(a[i][j]);
				}
			}
		}
		System.out.println(al);
	}

}
