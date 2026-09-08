package Lec6;

public class Swap_of_2_Number {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
//		int c = a;
//		a = b;
//		b = c;

		// without 3rd variable

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + " " + b);

	}
}
