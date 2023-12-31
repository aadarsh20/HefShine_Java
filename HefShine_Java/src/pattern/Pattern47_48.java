package pattern;

public class Pattern47_48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("--------------48-----------------------");
		int end=1;
		for(int i=1;i<=9;i++)
		{
			int num=9;
			for(int j=1;j<=end;j++)
			{
				System.out.print(num);
				num--;
			}
			System.out.println();
			end++;
		}
		
		
		System.out.println("---------------49-----------------------");
		
		
		int num1=9;
		int end1=1;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=end1;j++)
			{
				System.out.print(num1);
			}
			System.out.println();
			num1--;
			end1++;
		}

	}

}
