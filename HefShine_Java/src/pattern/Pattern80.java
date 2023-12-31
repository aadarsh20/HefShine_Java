package pattern;

public class Pattern80 {
public static void main(String[] args) {
	
//	int space1=1;
//	int space2=4;
//	for(int i=1;i<=5;i++)
//	{
//		for(int j=1;j<=space1;j++)
//		{
//			//if(j<=space1 || j<=space2)
//				//System.out.print(" ");
//			//else
//			System.out.print("*");
//		}
//		System.out.println();
//		space1++;
//		//space2--
//		;
//	}
	int star=1;
	int starEnd=10;
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=10;j++)
		{
			if(j<=star || j>=starEnd)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
		star++;
		starEnd--;
	}
	
}
}
