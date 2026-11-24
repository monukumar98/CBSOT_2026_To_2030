package Lec27;

public class Lexicographical_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		Number(0, n);

	}

	public static void Number(int curr, int n) {
		if (curr > n) {
			return;
		}
		System.out.println(curr);
		int i = 0;
		if (curr == 0) {
			i = 1;
		}
		for (; i <= 9; i++) {
			Number(curr * 10+i, n);
		}

	}

}
