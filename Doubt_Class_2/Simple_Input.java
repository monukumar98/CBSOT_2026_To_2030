package Doubt_Class_2;

import java.util.Scanner;

public class Simple_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Simple();

	}

	public static void Simple() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (true) {
			int a = sc.nextInt();
			sum = sum + a;
			if (sum < 0) {
				break;
			}
			System.out.println(a);
		}
	}

}
