package string;

public class Replace_charcter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="aadarsh";
		char a[]=s1.toCharArray();
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='a')
			{
				a[i]='f';
			}
		}
		
		System.out.println(a);

	}

}
