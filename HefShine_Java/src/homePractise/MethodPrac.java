package homePractise;

class Car
{
	String CarName;
	int CarNo;
	String Color;
	
	Car(String CarName, int CarNo, String Color )
	{
		
	}
	void CarInfo()
	{
		System.out.println(CarName+"  "+CarNo+"  "+Color);
	}
}
public class MethodPrac {

	public static void main(String[] args) 
	{
		Car cr=new Car("Tata", 12,"White");
		System.out.println(cr);
		cr.CarName="Tata";
		cr.CarNo=34;
		cr.Color="red";
		
		System.out.println(cr.CarName);
		System.out.println(cr.CarNo);
		System.out.println(cr.Color);
	}

}
