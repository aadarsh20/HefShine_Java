package arrays;

import java.util.Arrays;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6};
		int evenCnt=0;
		int oddCnt=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				evenCnt++;
			else
				oddCnt++;
		}
		int evenArr[]=new int[evenCnt];
		int oddArr[]=new int[oddCnt];
		
		int evenInd=0;
		int oddInd=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				evenArr[evenInd]=a[i];
				evenInd++;
			}
			else
			{
				oddArr[oddInd]=a[i];
				oddInd++;
			}
		}
		System.out.println(Arrays.toString(evenArr));
		System.out.println(Arrays.toString(oddArr));
		
		
		
		
		
		//Another way to even odd
//		int a[]= {1,2,3,4,5,6};
//		
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]%2==0)
//				System.out.println("Even : "+a[i]);
//		}
//		
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]%2!=0)
//				System.out.println("Odd : "+a[i]);
//		}
		
		
		
		
		
//		//Second way to 
//		
//		int a[]= {1,2,3,4,5,6};
//		int evenCnt=0;
//		int oddCnt=0;
//		
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]%2==0)
//				evenCnt++;
//			else
//				oddCnt++;
//		}
//		
//		int evenAr[]=new int[evenCnt];
//		int oddAr[]=new int[oddCnt];
//		
//		int evenInd=0;
//		int oddInd=0;
//		
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]%2==0)
//			{
//				evenAr[evenInd]=a[i];
//				evenInd++;
//			}
//			else
//			{
//				oddAr[oddInd]=a[i];
//				oddInd++;
//			}
//		}
//		
////		for(int i=0;i<evenAr.length;i++)
////		{
////			System.out.println(evenAr[i]);
////		}
////		for(int i=0;i<oddAr.length;i++)
////		{
////			System.out.println(oddAr[i]);
////		}
//
//		System.out.println("Even numbers : "+Arrays.toString(evenAr));
//		System.out.println("Odd	numbers : "+Arrays.toString(oddAr));
	}

}
