package variation;

public class Confuse_pappu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=56;
		
		String s1=""+num;
		
		char ch[]=s1.toCharArray();
		String s2="";

		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='6')
				s2+='9';
			else
				s2+=s1.charAt(i);
		}
		int num2=Integer.parseInt(s2);
		System.out.println(num2-num);
	}

}
