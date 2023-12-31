package arrays;

public class Equilibrium_point {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//own logic
//		 int ans=0;
//	        for(int i=0;i<n;i++)
//	        {
//	            int fsum=0;
//	            int ssum=0;
//	            for(int j=0;j<i;j++)
//	            {
//	                fsum+=a[j];
//	            }
//	            for(int j=i+1;j<n;j++)
//	            {
//	                ssum+=a[j];
//	            }
//	            if(fsum==ssum)
//	            {
//	                return i+1;
//	           // ans=i+1;
//	           // break;
//	            }
//	        }
//	        if(ans==0)
//	        return -1;
//	        else
//	        return ans;
		
		
		//logic
		int a[]= {1,3,5,2,2};
		int n=a.length;
		  if(n==1){
	            System.out.println(1);
	        }
	        
	        long sum1=0,sum2=0;
	        
	        for(int i=1;i<n;i++){
	            sum2+=a[i];
	        }
	        
	        for(int i=0;i<n-1;i++){
	            if(sum1==sum2){
	                System.out.println(i+1);
	            }
	            sum2-=a[i+1];
	            sum1+=a[i];
	        }
	        System.out.println(-1);

	}

}
