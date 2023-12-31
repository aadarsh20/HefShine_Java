package string;

public class Create_string {

	public static void main(String[] args) {
		
		// There have two ways to create string
		
		String s1=new String("Aadarsh");// it store in heap memory
		System.out.println(s1);

		String s2="Aadarsh@123";  // it store in string costant pool memory
		System.out.println(s2);
		
		String s3="Aadarsh@123"; 
		//System.out.println(s3);
		
		System.out.println(s1==s2);// this both are not equal because it store in diffrent memory
		
		System.out.println(s2==s3); // this both are same cause it save in same memory
	}

}
