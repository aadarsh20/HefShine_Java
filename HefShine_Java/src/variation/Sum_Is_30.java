package variation;

public class Sum_Is_30 {
 public static int add(int a[],int num)
 {
	 int sum=0;
	 for(int i=0;i<a.length;i++)
	 {
		 if(a[i]==10)
			 sum+=a[i];
	 }
	 if(sum==num)
		 
		 return sum;
	 else
		 return 0;
 }
	public static void main(String[] args) {
		
		int a[]= {10,77,10,54,-11,10,10};
		int num=30;
		int res=add(a,num);
		System.out.println(res);

	}

}
