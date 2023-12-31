package arrays;

public class Array_first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int []arr1= {1,2,3,4}; // this is another way to declare as a array when we knows a size of array
		int[] arr=new int[2];
		arr[0]=23;
		arr[1]=44;
		
		System.out.println(arr[1]); // it is used for single number
		
		for(int i=0;i<2;i++) // it is used for all elements
		{
			System.out.println(arr[i]);
		}
		
		

	}

}
