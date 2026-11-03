package Lec18;

public class SubString_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
//		System.out.println(s.substring(1, 4));
//		System.out.println(s.substring(2));
		SubString(s);

	}

	public static void SubString(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
		}
	}

}
