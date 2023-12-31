package pattern;

public class Pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int end=1;
//		char ch='A';
//		for(int i=1;i<=9;i++)
//		{
//			for(int j=1;j<=end;j++)
//			{
//				System.out.print(ch);
//			}
//			System.out.println();
//			ch++;
//			end++;
//		}
		
		
		
		int end=1;
		char ch='A';
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=end;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
			if(i<5)
			{
				end++;
				ch++;
			}
			else
			{
				end--;
				ch--;
			}	
		}

	}

}
