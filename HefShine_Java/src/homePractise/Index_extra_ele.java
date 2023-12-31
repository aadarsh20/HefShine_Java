package homePractise;

public class Index_extra_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Input:
//			N = 6
			int a[] = {2,4,6,8,9,10,12};
			int b[] = {2,4,6,8,10,12};
//			Output: 3
		
		for(int i=0;i<b.length;i++)
		{
			if(a[i]!=b[i])
			{
				System.out.println(i);
				break;
			}
		}
		
			

	}

}
