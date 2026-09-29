package Doubt_Class_2;

import java.util.Scanner;

public class Shopping_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int m = sc.nextInt();// Aayush
			int n = sc.nextInt();// harshit
			Shopping(m, n);
			// t--;
		}
	}

	public static void Shopping(int m, int n) {
		int A = 0, H = 0;
		int phone = 1;
		while (true) {
			A = A + phone;
			if (A > m) {
				System.out.println("Harshit");
				break;
			}
			phone++;
			H = H + phone;
			if (H > n) {
				System.out.println("Aayush");
				break;
			}
			phone++;
		}
	}

}
