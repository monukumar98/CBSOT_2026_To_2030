package Doubt_Class_2;

import java.util.Scanner;

public class Chewbacca_and_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

	}

	public static long Chewbacca(long n) {
		long sum = 0;
		long mul = 1;
		while (n > 9) {
			long rem = n % 10;
			if (rem >= 5) {
				rem = 9 - rem;
			}
			sum = sum + rem * mul;
			mul = mul * 10;
			n = n / 10;
		}
		if(n>=5 && n<9) {
			sum = sum + (9-n) * mul;
		}
		else {
			sum = sum + n * mul;
		}
		return sum;
	}

}
