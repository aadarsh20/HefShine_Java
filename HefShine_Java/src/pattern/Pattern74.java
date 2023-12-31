package pattern;

public class Pattern74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int end=5;
		int space=4;
		int mid=5;
		for(int i=1;i<=5;i++)
		{
			char ch='A';
			for(int j=1;j<=end;j++)
			{
				if(j<=space)
					System.out.print(" ");
				else
				{
					System.out.print(ch);
					if(j<mid)
						ch++;
					else
						ch--;
				}
			}
			System.out.println();
			end++;
			space--;
		}

	}

}
