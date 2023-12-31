package javaCodes;

public class NestedLoop {

	public static void main(String[] args) {
		int c=1;
		for(int i=0;i<3;i++)
		{
			int a=1;
			for(int j=0;j<3;j++)
			{
				int b=1;
				System.out.println(a+" "+b+" "+c);
				a++;
				b++;
				c++;
			}
		}

	}

}
