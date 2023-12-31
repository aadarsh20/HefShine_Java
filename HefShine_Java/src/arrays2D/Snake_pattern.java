package arrays2D;

public class Snake_pattern {

	public static void main(String[] args) 
	{
		int n=5;
		int [][] a=new int [5][5];
		int count=1;
		int jmin=0,imin=0,imax=a.length-1,jmax=a.length-1;
		while(true)
		{
			//row upper
			for(int j=jmin;j<jmax;j++)
			{
				a[imin][j]=count++;
			}
			//col right
			for (int i = imin; i < imax; i++) 
			{
				a[i][jmax]=count++;
			}
			//row lower
			for (int j = jmax; j > jmin; j--) 
			{
				a[imax][j]=count++;
			}
			//col left
			for (int i = imax; i > imin; i--) 
			{
				a[i][jmin]=count++;
			}
			if(imin==imax && jmin==jmax)
				a[imin][jmin]=count++;
			
			imin++;;jmin++;imax--;jmax--;
			if(imin>imax || jmin>jmax)
				break;
		}
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++) 
			{
				if(a[i][j]<10)
					System.out.print(a[i][j]+"  ");
				else
					System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
