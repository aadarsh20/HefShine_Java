package homePractise;

public class String_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=12;
		int sum=0;
		int temp=n;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				sum+=i;
		}
		if(sum>temp)
			System.out.println("yes");
		else
			System.out.println("no");
//		String a = "abcdcbaf";
//		String b = a.toLowerCase();
//		for (int i = 0; i < b.length(); i++) 
//		{
//			int cnt = 0;
//			for (int j = i + 1; j < b.length(); j++) 
//			{
//				if (b.charAt(i) == b.charAt(j))
//					cnt++;
//			}
//			if (cnt == 0) 
//			{
//				System.out.println(i);
//				break;
//			}
//		}
	}
}
