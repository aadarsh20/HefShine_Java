package pattern;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stubend
		int end=6;
		char ch='F';
		for(int i=1;i<=6;i++)
		{
			char ch1=ch;
			for(int j=1;j<=end;j++)
			{
				System.out.print(ch1--);
			}
			System.out.println();
			ch--;
			end--;
		}
		
		int end1=1;
		char ch2='A';
		for(int i=1;i<=6;i++)
		{
			char ch1=ch2;
			for(int j=1;j<=end;j++)
			{
				System.out.print(ch1++);
			}
			System.out.println();
			ch2--;
			end++;
		}
		
//		int end=1;
//		for(int i=1;i<=5;i++)
//		{
//			int cnt=5;
//			for(int j=1;j<=end;j++)
//			{
//				System.out.print(cnt);
//				cnt--;
//			}
//			System.out.println();
//			end++;
//		}

	}

}
