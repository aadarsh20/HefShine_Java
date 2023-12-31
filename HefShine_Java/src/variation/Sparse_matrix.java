package variation;

public class Sparse_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{4,0,0},
					{0,5,0},
					{1,2,6}};
		String ans=cal(a);
		System.out.println(ans);
	}
	private static String cal(int[][] a) {
		// TODO Auto-generated method stub
		
		int zerocnt=0;
		int elecnt=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				elecnt++;
				if(a[i][j]==0)
					zerocnt++;
				
			}
		}
		if(zerocnt>elecnt/2)
			return "sparse matrix";
		else
			return "not";
		
		
		}
	}
