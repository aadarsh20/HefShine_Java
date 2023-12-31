package string;

public class Swap_kth_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="ABCDEFGH";
		int k=3;
		
		int temp=s1.charAt(k);
		int temp1=s1.charAt(s1.length()-3);
		
		int swap=temp;
		temp=temp1;
		temp1=swap;
		
		System.out.println(s1);

	}

}
