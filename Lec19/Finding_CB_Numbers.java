package Lec19;

import java.util.Scanner;

public class Finding_CB_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String s = sc.next();
		SubString(s);
	}

	public static void SubString(String s) {
		boolean[] visited = new boolean[s.length()];
		int c = 0;
		for (int len = 1; len <= s.length(); len++) {
			for (int j = len; j <= s.length(); j++) {
				int i = j - len;
				String str = s.substring(i, j);
				if (isCbnumber(Long.parseLong(str)) && isvisited(visited, i, j - 1)) {
					c++;

				}

			}
		}
		System.out.println(c);
	}

	public static boolean isvisited(boolean[] visited, int si, int ei) {
		for (int i = si; i <= ei; i++) {
			if (visited[i] == true) {
				return false;
			}

		}
		for (int i = si; i <= ei; i++) {
			visited[i] = true;//
		}

		return true;
	}

	public static boolean isCbnumber(long num) {
		if (num == 0 || num == 1) {
			return false;
		}
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (num % arr[i] == 0) {
				return false;
			}
		}
		return true;
	}

}
