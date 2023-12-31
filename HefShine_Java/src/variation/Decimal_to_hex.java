package variation;

public class Decimal_to_hex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1947;
		
		String hex="";
		while(num>0)
		{
			hex=convert(num%16)+hex;
			num=num/16;
		}
		System.out.println(hex);
		

	}

	private static String convert(int i) 
	{
		switch (i) {
//		case 1 : return 1;
//		case 2 : return 2;
//		case 3 : return 3;
//		case 4 : return 4;
//		case 5 : return 5;
//		case 6 : return 6;
//		case 7 : return 7;
//		case 8 : return 8;
//		case 9 : return 9;
		case 10 : return "A";
		case 11 : return "B";
		case 12 : return "C";
		case 13 : return "D";
		case 14 : return "E";
		case 15 : return "F";

		default : return ""+i;
		}
	}

}
