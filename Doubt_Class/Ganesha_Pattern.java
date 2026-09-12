package Doubt_Class;

import java.util.Scanner;

public class Ganesha_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star1 = n / 2 + 1;
		int row = 1;
		int star2 = n / 2;
		while (row <= n / 2) {
			int i = 1;
			while (i <= star1) {
				if (i == 1 || i == star1) {
					System.out.print("*");

				} else {
					System.out.print(" ");
				}
				i++;
			}
			if (row == 1) {
				int j = 1;
				while (j <= star2) {

					System.out.print("*");
					j++;

				}
			}

			// Next line ki prep
			row++;
			System.out.println();
		}
		int j = 1;
		while (j <= n) {

			System.out.print("*");
			j++;

		}
		System.out.println();
		// part -2 lower part
		star1 = n / 2;
		row = n / 2 + 2;
		star2 = n / 2 + 1;
		while (row <= n) {
			int i = 1;
			while (i <= star1) {
				if (row == n) {
					System.out.print("*");
				} 
				else {
					System.out.print(" ");
				}
				i++;
			}
			j = 1;
			while (j <= star2) {
				if (j == 1 || j == star2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				j++;
			}
			row++;
			System.out.println();
		}

	}

}
