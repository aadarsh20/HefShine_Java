package pattern;

public class NumberPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end=4;
		for(int i=1;i<=5;i++)
		{
			int SpaceCnt=1;
			for(int j=1;j<=5;j++)
			{
				if(j<=SpaceCnt)
					System.out.print(" ");
				else
				{
					System.out.print(SpaceCnt);
					SpaceCnt++;
				}
			}
			System.out.println();
			SpaceCnt--;
		
		}

	}

}
