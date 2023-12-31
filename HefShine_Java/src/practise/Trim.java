package practise;

public class Trim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//remove all spaces from
//		String s1="  hello  aada";
//		String s3="";
//		for(int i=0;i<s1.length()-1;i++)
//		{
//			if(s1.charAt(i)!=' ')
//				s3+=s1.charAt(i);
//		}
//		System.out.println(s3);
		
		String s1="     hi aadarsh    hello  from  pali  ";
		s1=s1.trim();
		String s3="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==' ' && s1.charAt(i+1)==' ')
				continue;
			else
				s3+=s1.charAt(i);
		}
		System.out.println(s3);
	}

}
