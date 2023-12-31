package variation;

import java.awt.image.ColorConvertOp;

import string.Char_at;

public class Hex_to_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="79B";
		int num=0;
		
		for (int i = 0; i < s1.length(); i++)
		{
			num=num*16+convert(s1.charAt(i));
			
		}
		System.out.println(num);


	}

	private static int convert(char charAt) {
		// TODO Auto-generated method stub
		
		switch (charAt) {

		case 'A' : return 10;
		case 'B' : return 11;
		case 'C' : return 12;
		case 'D' : return 13;
		case 'E' : return 14;
		case 'f' : return 15;

		default : return Integer.parseInt(""+charAt);
		}
		
	}

}
