package string;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="hello aadarsh";
		//char a[]=s1.toCharArray();
		//char b[]=new char[a.length];
		//int index=0;
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2+=s1.charAt(i);
		}
		System.out.println(s2);

	}

}
