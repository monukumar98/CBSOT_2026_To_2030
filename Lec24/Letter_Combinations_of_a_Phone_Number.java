package Lec24;

import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number {
	static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ll = new ArrayList<>();
		KeyPaid("278", "", ll);
		System.out.println(ll);

	}

	public static void KeyPaid(String ques, String ans, List<String> ll) {
		if (ques.length() == 0) {
		//	System.out.println(ans);
			ll.add(ans);
			return;
		}

		char ch = ques.charAt(0);// '2'
		String k = key[ch - '0'];
		for (int i = 0; i < k.length(); i++) {
			KeyPaid(ques.substring(1), ans + k.charAt(i), ll);
		}

	}

}
