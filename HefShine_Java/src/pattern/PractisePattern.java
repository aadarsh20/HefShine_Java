package pattern;

import javax.annotation.processing.SupportedSourceVersion;

public class PractisePattern {

	public static void main(String[] args) {
		
		int end=9;
		int space=0;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(j<=space)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
			space++;
			end--;
		}
		
		
//		int n=1;
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=n;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//			n+=2;
//		}
		
		
		
		
		
//	   *******	
//		*****
//		 ***
//		  *
//		int end=7;
//		int space=0;
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=end;j++)
//			{
//				if(j<=space)
//					System.out.print(" ");
//				else
//					System.out.print("*");
//			}
//			System.out.println();
//			space++;
//			end--;
//		}
		
		
		
//		int start=4;
//		int end=6;
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=9;j++)
//			{
//				if(j>=start && j<=end)
//					System.out.print("*");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//			start--;
//			end++;
//		}
		
		
		
//		for(int i=1;i<=7;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				//if(i)
//			 if(i==4 || j==1 || j==5)
//					System.out.print("*");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}
		
		
		//D
//		System.out.println();
//		for(int i=1;i<=7;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				if(i==1 || i==7 || j==1 || j==5)
//					System.out.print("*");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}
		
		
//		int start=5;
//		int end=6;
//		for(int i=1;i<=9;i++)
//		{
//			for(int j=1;j<=10;j++)
//			{
//				if(j<=start || j>=end)
//					System.out.print("*");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//			if(i<5)
//			{
//				start--;
//				end++;
//			}
//			else
//			{
//				start++;
//				end--;
//			}
//		}
		
		
		
//		//int num=1;
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				if(j==1 || j==3 || j==5)
//				System.out.print(1);
//				else
//					System.out.print(0);
//			}
//			System.out.println();
//		}
		
		
		
//		int end=5;
//		int space=4;
//		for(int i=1;i<=5;i++)
//		{
//			char ch='A';
//			for(int j=1;j<=end;j++)
//			{
//				if(j<=space)
//					System.out.print(" ");
//				else
//				{
//					System.out.print(ch);
//					if(j<5)
//						ch++;
//					else
//						ch--;
//				}
//				
//			}
//			System.out.println();
//			end++;
//			space--;
//		}
//		
		
//		int end=5;
//		int space=0;
//		for(int i=1;i<=10;i++)
//		{
//			for(int j=1;j<=end;j++)
//			{
//				if(j<=space)
//					System.out.print(" ");
//				else
//					System.out.print("*");
//			}
//			System.out.println();
//			if(i<5)
//			{
//				space++;
//				//end--;
//			}
//			else
//			{
//				space--;
//				//end++;
//			}
//		}
		
		
		
//		int end=1;
//		int cnt=1;
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=end;j++)
//			{
//				System.out.print(cnt);
//				cnt++;
//			}
//			System.out.println();
//			//cnt++;
//			end++;
//		}
		
		
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				if(j==3 || i==3)
//					System.out.print("*");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}
		
		
//		91
		
//		int end=5;
//		int space=4;
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=end;j++)
//			{
//				if(j<=space)
//					System.out.print(" ");
//				else
//					System.out.print("N");
//			}
//			System.out.println();
//			end--;
//			space--;
//		}
		
		
//		int end=1;
//		int num=1;
//		for(int i=1;i<=5;i++)
//		{
//			int num1=num;
//			for(int j=1;j<=end;j++)
//			{
//				System.out.print(num1);
//				num1=num1+4;
//			}
//			System.out.println();
//			end++;
//			num++;
//		}
		
		
//		75
		
		
//		int end=3;
//		int mid=2;
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=end;j++)
//			{
//				if(j==mid)
//					System.out.print(" ");
//				else
//					System.out.print("*");
//			}
//			System.out.println();
//			end=end+2;
//			mid++;
//		}
		
		
		
//		71
		
//		int end=1;
//		for(int i=1;i<=5;i++)
//		{
//			int num=1;
//			for(int j=1;j<=end;j++)
//			{
//				System.out.print(num);
//				if(j<i)
//					num++;
//				else
//					num--;
//			}
//			System.out.println();
//			end=end+2;
//		}
		
		
		
		
//		57
//		
//		int end=1;
//		int num=1;
//		for(int i=1;i<=5;i++)
//		{
//			int num1=num;
//			for(int j=1;j<=end;j++)
//			{
//				System.out.print(num1);
//				num1++;
//			}
//			System.out.println();
//			end++;
//			num++;
//			//
//			num1++;
//		}
		
		
		
//		int end=1;
//		char ch='A';
//		for(int i=1;i<=6;i++)
//		{
//			char ch1=ch;
//			for(int j=1;j<=end;j++)
//			{
//				System.out.print(ch1);
//				ch1++;
//			}
//			System.out.println();
//			end++;
//			ch++;
//		}
		
//		int start=5;
//		int end=6;
//		for(int i=1;i<=9;i++)
//		{
//			for(int j=1;j<=10;j++)
//			{
//				if(j<=start || j>=end)
//					System.out.print("*");
//				else
//				System.out.print(" ");
//			}
//			System.out.println();
//			if(i<5)
//			{
//				start--;
//				end++;
//			}
//			else
//			{
//				start++;
//				end--;
//			}
//		}
		
		
//		int end=9;
//		int space=4;
//		for(int i=1;i<=9;i++)
//		{
//			for(int j=1;j<=end;j++)
//			{
//				if(j<=space)
//				System.out.print(" ");
//				else
//					System.out.print("*");
//			}
//			System.out.println();
//			if(i<5) {
//				space--;
//				end--;
//			}
//			else
//			{
//				space++;
//				end++;
//			}
//		}
		
//		for(int i=1;i<=10;i++)
//		{
//			int cnt=0;
//			for(int j=1;j<=i;j++)
//			{
//				if(i%j==0)
//					cnt++;
//			
//			}
//			if(cnt==2)
//				System.out.println(i);
//	
//		}
		
		
//		int end=1;
//		char ch='A';
//		for(int i=1;i<=6;i++)
//		{
//			char ch1=ch;
//			for(int j=1;j<=end;j++)
//			{
//				System.out.print(ch1);
//				ch1--;
//				
//			}
//			System.out.println();
//			end++;
//			ch++;
//		}
		
		
		
	
		//System.out.println(ch++);
		
//int space=0;
//int end=5;
//for(int i=1;i<=9;i++)
//{
//	for(int j=1;j<=5;j++)
//	{
//		if(j<=space)
//			System.out.print(" ");
//		else
//			System.out.print("*");
//	}
//	System.out.println();
//	if(i<5)
//		space++;
//	else
//		space--;
//}
		
		
		
		
//		
//	     *
//	    **
//	   ***
//	  ****
//	 *****
//		
//		int space=4;
//		//int end=1;
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				if(j<=space)
//					System.out.print(" ");
//				else
//					System.out.print("*");
//			}
//			System.out.println();
//			space--;
//			//end++;
//			
//		}
		
		
		
		
		
//		int hashEnd=4;
//		int starEnd=1;
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=hashEnd;j++)
//			{
//				System.out.print(" "
//						+ "");
//			}
//			for(int j=1;j<=starEnd;j++)
//			{
//				System.out.print("*");
//			}
//			hashEnd--;
//			starEnd++;
//			System.out.println();
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
//		****
//		***
//		**
//		*
		
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=4;j>=i;j--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// Another way
//		int end=5;
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=end;j++)
//			{
//				System.out.print("*");
//			}
//			end--;
//			System.out.println();
//		}
		
		
		
		
		
		
//		
//		*****
//		****
//		***
//		**
//		*
//		**
//		***
//		****
//		*****
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		*
//		**
//		***
//		****
//			
//		int end=1;
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=end;j++)
//			{
//				System.out.print("*");
//			}
//			end++;
//			System.out.println();
//		}
//		
		
		
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}

	}

}
