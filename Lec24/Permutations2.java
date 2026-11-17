package Lec24;

public class Permutations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abca";
		print(s, "");
	}

	public static void print(String qeus, String ans) {
		if (qeus.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < qeus.length(); i++) {
			char ch = qeus.charAt(i);
			if (!Is_Present(qeus, ch, i + 1)) {
				String s1 = qeus.substring(0, i);
				String s2 = qeus.substring(i + 1);
				print(s1 + s2, ans + ch);
			}
		}

	}

	public static boolean Is_Present(String str, char ch, int idx) {

		for (int i = idx; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				return true;
			}

		}
		return false;

	}

}
