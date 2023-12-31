package pattern;

public class Pattern42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int space=0;
		int num=1;
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=space)
				System.out.print(" ");
			else
			{
				System.out.print(num+" ");
				if(j<5)
					num++;
				else
					num--;
			}
			}
			System.out.println();
			num++;
			if(i<5)
				space++;
			else
				space--;
				
		}
	}

}
