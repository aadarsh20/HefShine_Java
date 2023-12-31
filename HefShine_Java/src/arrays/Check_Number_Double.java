package arrays;

public class Check_Number_Double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5,3,3};
		
		System.out.println();
		int checkNum=6;
		int cnt=0;
		for(int i=0;i<arr.length;i++)
		{
			if(checkNum==i)
				cnt++;
		}
		if(cnt>=2)
			System.out.println(checkNum+" is present in an array "+cnt+" time");
		else
			System.out.println(checkNum+" is present in an array "+cnt+" time");
			
	}

}
