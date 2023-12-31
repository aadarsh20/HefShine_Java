package oops;


class Address
{
	String city,state;
	int pinCode;
	
	Address(String city,String state,int pinCode)
	{
		this.city=city;
		this.state=state;
		this.pinCode=pinCode;
	}
}
class Student
{
	String name;
	int id;
	Address address;
	private void display1()
	{
		
	}
	
	public Student (String name, int id, Address address)
	{
		this.name=name;
		this.id=id;
		this.address=address;
	}
	void display() 
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(address.city);
		System.out.println(address.state);
		System.out.println(address.pinCode);
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		//StudentPractise s1=new StudentPractise("raj",23,new Address("pune","maharashtra",2141415));
		//s1.display();
	}

}
