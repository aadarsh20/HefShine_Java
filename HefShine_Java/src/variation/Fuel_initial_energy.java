package variation;

public class Fuel_initial_energy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {4,-10,4,4,4};
		int min=0;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			if(sum<min)
				min=sum;
		}
		if(min<0)
			min=-min+1;
		else
			min=1;
		System.out.println(min);
	}

}
