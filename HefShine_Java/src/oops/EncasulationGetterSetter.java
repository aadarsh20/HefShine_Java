package oops;
class Teacher
{
	private String name;
	private int id;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}

public class EncasulationGetterSetter {

	public static void main(String[] args) {
		Teacher t1=new Teacher();
		t1.setId(12);
		System.out.println(t1.getId());
		
		t1.setName("AADARSH");
		System.out.println(t1.getName());


	}

}
