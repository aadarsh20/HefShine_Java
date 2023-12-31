package arrays2D;

import java.util.Arrays;

public class Rotate_Array {

	public static void main(String[] args) {
		
		int a1[]={1,2,3};
		int a2[]={4,5,6};
		int a3[]={7,8,9};
		int b[][]= {a1,a2,a3};
		int temp=b[0][0];
		for(int i=0;i<b.length-1;i++)
		{
			b[i]=b[i+1];
		}
		b[b.length-1][b.length-1]=temp;
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]);
			}
			System.out.println();
		}

	}

}
