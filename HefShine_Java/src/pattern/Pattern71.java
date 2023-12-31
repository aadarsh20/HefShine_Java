package pattern;

public class Pattern71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int end=1;
		for(int i=1;i<=5;i++)
		{
			int num=1;
			for(int j=1;j<=end;j++)
			{
				System.out.print(num);
				if(j<i)
					num++;
				else
					num--;
			}
			System.out.println();
			end=end+2;
		}

	}

}
