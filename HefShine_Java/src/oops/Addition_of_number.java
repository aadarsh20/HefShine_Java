package oops;

public class Addition_of_number {
		int num1;
		int num2;
		int num3;
		
		Addition_of_number() 
		{
			
		}
		void Addition()
		{
			System.out.println(num1+num2);
		}
		void Mul()
		{
			System.out.println(num1*num2);
		}
		void Subtr()
		{
			System.out.println(num1-num2);
		}
	//public class Add
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Addition_of_number ad=new Addition_of_number();
		ad.num1=12;
		ad.num2=14;
		ad.num3=32;
		ad.Addition();
		ad.Mul();
		ad.Subtr();
		
	}

}
