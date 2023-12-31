package pattern;

public class Pattern60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		12345
//		2345
//		345
//		45
//		5
//		5
//		45
//		345
//		2345
//		12345
		
		int end=5;
		int num=1;
		for(int i=1;i<=10;i++)
		{
			int num1=num;
			for(int j=1;j<=end;j++)
			{
				System.out.print(num1);
				num1++;
			}
			System.out.println();
			if(i<=4)
			{
				end--;
				num++;
			}
			else
			{
				num--;
				end++;
			}
		}

	}

}
