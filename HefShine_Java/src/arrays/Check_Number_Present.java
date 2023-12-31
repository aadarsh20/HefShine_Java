package arrays;

public class Check_Number_Present {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,20,50,30,40,50};
		int cheEle=50;
		int cnt=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==cheEle)
				cnt++;
		}
		//
		System.out.println(cnt);
		if(cnt==0)
			System.out.println(cheEle+" is not present in that array ");
		else
			System.out.println(cheEle+" is present " +cnt+ " times in that array");
	}

}
