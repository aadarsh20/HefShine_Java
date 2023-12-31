package arrays2D;

public class Transform {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		int b[][]=new int [a.length][a[0].length];
		for(int i=0;i<b.length;i++) 
		{
			for(int j=0;j<b.length;j++)
			{
				b[j][i]=a[i][j];
			}
		}
		
		System.out.println("Using for loop");
		for(int i=0;i<b.length;i++) 
		{
			for(int j=0;j<b.length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		//Using for each loop
		System.out.println("Using for each loop");
		
		for (int[] arr : b)
		{
			for (int ele : arr) {
				System.out.print(ele+" ");
			}
			System.out.println();
		}

	}

}
