package Lec21;

public class Count_Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "coding";
		System.out.println(countVowels(s));

	}

	public static int countVowels(String s) {
		if (s.length() == 0) {
			return 0;
		}
		char ch = s.charAt(0);
		int c = 0;
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			c = 1;
		}
		c = c + countVowels(s.substring(1));
		return c;
	}
//	public static int countVowels(String s, int i) {
//		if (i == s.length()) {
//			return 0;
//		}
//		char ch = s.charAt(i);
//		int c = 0;
//		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//			c = 1;
//		}
//		c = c + countVowels(s, i + 1);
//		return c;
//	}

}
