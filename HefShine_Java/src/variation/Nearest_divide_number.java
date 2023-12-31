package variation;

public class Nearest_divide_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1,m=8;
		int i=0;
		while(true)
		{
			if((num+i)%m==0)
			{
				System.out.println(num+1);
				break;
			}
			if((num-i)%m==0)
			{
				System.out.println(num-1);
				break;
			}
			i++;	
		}

	}

}
