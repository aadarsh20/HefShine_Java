package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// left shift
		
//		int a[]= {1,2,3,4,5};
//		int temp=a[0];
//		for(int i=0;i<a.length-1;i++)
//		{
//			a[i]=a[i+1];
//		}
//		a[a.length-1]=temp;
//		System.out.println(Arrays.toString(a));
		
		
		
		//right shift
		
//		int a[]= {1,2,3,4,5};
//		int temp=a.length-1;
//		for(int i=a.length-1;i>0;i--)
//		{
//			a[i]=a[i-1];
//		}
//		a[0]=temp;
//		System.out.println(Arrays.toString(a));
		
		
		
//		Reverse array
//		int a[]= {1,2,3,4};
//		int start=0;
//		int end=a.length-1;
//		while(start<end)
//		{
//			int temp=a[start];
//			a[start]=a[end];
//			a[end]=temp;
//			
//			start++;
//			end--;
//		}
//		System.out.println(Arrays.toString(a));
		
		
		
		
		//pair
		
//		int a[]= {1,2,1};
//		int uniqueCnt=0;
//		for(int i=0;i<a.length;i++)
//		{
//			int cnt=0;
//			for(int j=i+1;j<i;j++)
//			{
//				if(a[i]==a[j])
//					cnt++;
//			}
//			if(cnt==0)
//				uniqueCnt=i;
//		}
//		//System.out.println(uniqueCnt);
//		
//		int b[]=new int[uniqueCnt];
//		int index=0;
//		for(int i=0;i<a.length;i++)
//		{
//			int cnt=0;
//			for(int j=0;j<i;j++)
//			{
//			if(a[i]==a[j])
//				cnt++;
//			}
//			if(cnt==0)
//			{
//				b[index]=a[i];
//				index++;
//			}
//		}
//		for(int i=0;i<b.length;i++)
//		{
//			for(int j=0;j<b.length;j++)
//			{
//				System.out.println(b[i]+" "+b[j]);
//			}
//			System.out.println();
//		}
		
		
		
		
		
		// even odd
		
//		int a[]= {1,2,3,4,5,6};
//		
//		int evenCnt=0;
//		int oddCnt=0;
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]%2==0)
//				evenCnt++;
//			else
//				oddCnt++;
//		}
//		
//		int[] evenAr=new int[evenCnt];
//		int[] oddAr=new int[oddCnt];
//		
//		int evenInd=0;
//		int oddInd=0;
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
//		System.out.println(Arrays.toString(evenAr));
//		System.out.println(Arrays.toString(oddAr));
//		
		
//		int [][] a= {{1,2,3},{4,23,5},{5,4,7}};
//		
//		int min=Integer.MAX_VALUE;
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<a.length;j++)
//			{
//				if(a[i][j]>min)
//					min=a[i][j];
//			}
//			System.out.println();
//		}
		
		
		
		
		
//		// sort array
//		
//		int a[]= {4,6,2,3,1,5};
//		
//		for(int i=0;i<a.length;i++)
//		{
//			int min=i;
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(j<a[min])
//					min=j;
//			}
//			int temp=a[i];
//			a[i]=a[min];
//			a[min]=temp;
//		}
//		System.out.println(Arrays.toString(a));
		
		
		
		
		
//		binary search
		
//		int a[]= {1,2,3,4,5};
//		int num=9;
//		
//		int start=0;
//		int end=a.length-1;
//		int cnt=0;
//			
//			while(start<=end)
//			{
//			int mid=(start+end)/2;
//			if(a[mid]==num)
//			{
//				cnt++;
//				System.out.println("found at index "+mid);
//			}
//			if(num<a[mid])
//				end=mid-1;
//			else
//				start=mid+1;
//			}	
//			if(cnt==0)
//				System.out.println("not found");
		
		
		
		
		
//		
//		int a[]= {5,1,3,4,7};
//		Arrays.sort(a);
//		for(int i=0;i<a.length;i++)
//		{
//		System.out.print(a[i]+" ");
//		}
////		
//		int a[]= {1,2,3,4};
//		int min=Integer.MIN_VALUE;
//		for (int i = 0; i < a.length; i++) 
//		{
//			if(a[i]>min)
//				min=a[i];
//		}
//		System.out.println(min);
		
		
		
		
//		int start=0;
//		int end=a.length-1;
//		while(start<end)
//		{
//			int temp=a[start];
//			a[start]=a[end];
//			a[end]=temp;
//			
//			start++;
//			end--;
//		}
//		System.out.println(Arrays.toString(a));
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a size");
//		int size=sc.nextInt();
//		
//		int a[]=new int[size];
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println("Enter a element");
//			a[i]=sc.nextInt();
//		}
//		System.out.println(Arrays.toString(a));

		
		
		
		
		
		
		
		
//		int a[]= {1,2,3,4,5};
//		
//		int num=5;
//		int cnt=0;
//		int start=0;
//		int end=a.length-1;
//		while(start<end)
//		{
//			int mid=(start+end)/2;
//			if(a[mid]==num)
//			{
//				cnt++;
//				System.out.println(a[mid]);
//				break;
//			}
//			if(num>a[mid])
//				start=mid+1;
//			else
//				end=mid-1;
//		}
//		
		
		
		
		
		
//		int[] arr1= {1,2,4};
//		System.out.println(Arrays.toString(arr1));
	
		
//		for(int i=a.length-1;i>=0;i--)
//		{
//			System.out.print(a[i]);
//		}
//		
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Array size : ");
//		while(true)
//		{
//		int size=sc.nextInt();
//		int a[]=new int[size];
//		for(int i=0;i<size;i++)
//		{
//			a[i]=sc.nextInt();
//		}
// 
//		//System.out.println("your input arrys");
//		System.out.println("Enter a number to check present in an array: ");
//		int che=sc.nextInt();
//		int cnt=0;
//		for(int i=0;i<a.length;i++ )
//		{
//			if(a[i]==che)
//				cnt++;
//		}
//		if(cnt==0)
//			System.out.println("not found");
//		else
//			System.out.println("found "+che+" num "+cnt+" times");
//		}
		
		
//		int a[]= {1,2,3,4};
//		int start=0;
//		int end=a.length-1;
//		
//		while(start<end)
//		{
//			int temp=a[start];
//			a[start]=a[end];
//			a[end]=temp;
//			
//			start++;
//			end--;
//		}
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
	}

}
