package method;

public class ElePresentOrNot {

	public static void main(String[] args) {

		int a[]= {2,4,7,3,8,1};
		int ele=2;
		
		check(a,ele);
	}
	
	static void check(int a[],int ele)
	{
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele)
			{
				System.out.println("found at index : "+i);
				cnt++;
			}
		}
		if(cnt==0)
			System.out.println("not found");
	}
	

}
