package access_modifiers;

import java.util.Scanner;

class employee
{
	protected int emp_id;
	public String emp_name;
	private int emp_salary;
	String emp_depa;
	
	
	// getter and setter for private variable
	public int getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(int emp_salary) {
		this.emp_salary = emp_salary;
	}
	
	
	public void m1()
	{
		
	}
	void m2()
	{
		
	}
	protected void m3()
	{
		
	}
	private void m4()
	{
		
	}
}

public class EmployeeDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		employee emp=new employee();
		System.out.println("Enter a Employee id");
		emp.emp_id=sc.nextInt();
		System.out.println("Enter a Employee name");
		emp.emp_name=sc.next();
		System.out.println("Enter a Employee salary");
		emp.getEmp_salary();
		emp.setEmp_salary(sc.nextInt());
		System.out.println("Enter a Employee department");
		emp.emp_depa=sc.next();
		System.out.println();

		
	}

}
