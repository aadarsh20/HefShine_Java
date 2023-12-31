package variation;

public class EvenOddRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
				System.out.println("Even number: "+i);
			//else if(i%2!=0)
				//System.out.println(i);
		}
		System.out.println();
		for(int j=1;j<=20;j++)
		{
			if(j%2!=0)
				System.out.println("Odd number : "+j);
		}

	}

}
