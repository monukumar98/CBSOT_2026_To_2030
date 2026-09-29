package Doubt_Class_2;

import java.util.Scanner;

public class Conversion_Any_to_Any {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sb = sc.nextInt();
		int db = sc.nextInt();
		int sn = sc.nextInt();
		int x = sb_decimal(sb, sn);
		System.out.println(decimal_db(db, x));
	}

	public static int decimal_db(int db, int num) {
		int sum = 0, mul = 1;
		while (num > 0) {
			int rem = num % db;
			sum = sum + rem * mul;
			num = num / db;
			mul = mul * 10;

		}
		return sum;
	}

	public static int sb_decimal(int sb, int sn) {
		int sum = 0, mul = 1;
		while (sn > 0) {
			int rem = sn % 10;
			sum = sum + rem * mul;
			sn = sn / 10;
			mul = mul * sb;

		}
		return sum;
	}
}
