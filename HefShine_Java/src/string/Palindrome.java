package string;

public class Palindrome {

	public static void main(String[] args) {

		String s1 = "aba";
		String ans = pal(s1);
		System.out.println(ans);
		if (s1.equals(ans)) System.out.println("same");
		else System.out.println("not same");

	}

	private static String pal(String s1) {
		String b = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			b += s1.charAt(i);
		}
		return b;

	}
}
