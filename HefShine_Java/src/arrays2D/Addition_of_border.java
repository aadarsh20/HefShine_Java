package arrays2D;

public class Addition_of_border {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{1,1,1,1},
				{2,2,2,2},
				{3,3,3,3},
				{4,4,4,4}};
		int sum=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			if(i==0 || i==3 || j==0 || j==3)
				sum+=a[i][j];
		}		
	}
	System.out.println(sum);

	}

}
