package string;

public class String_to_int_sum {

	public static void main(String[] args) {
		String s1="8dhw43j6";
		int ans=str(s1);
		System.out.println(ans);
	}
	public static int str(String s1)
	{
		int sum=0;
		int cnt=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
			{
				cnt++;
				int num=(s1.charAt(i)-48);
				sum+=num;
			}
		}
		
		return sum;
	}
}
