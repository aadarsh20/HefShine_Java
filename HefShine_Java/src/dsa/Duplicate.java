package dsa;

public class Duplicate {

	public static void main(String[] args) {
		
		int a[]= {3,4,2,6,3,8,3};
		
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])			
					cnt++;
			}
			if(cnt>=2)
			{
				System.out.println(a[i]+" found "+cnt+" times");
				break;
			}
			else
				System.out.println("there is no any duplicate value");
		}

	}

}
