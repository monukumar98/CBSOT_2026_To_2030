package Doubt_Class_2;

import java.util.Scanner;

public class Boston_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(BostonNumbers(n));
	}

	public static int BostonNumbers(int n) {
		int i = 2;
		int sum = 0;
		int p = n;
		while (n > 1) {
			if (n % i == 0) {
				sum = sum + sum_of_digit(i);
				n = n / i;
			} else {
				i++;
			}
		}
		int sum2 = sum_of_digit(p);
		if (sum == sum2) {
			return 1;
		} else {
			return 0;
		}

	}

	public static int sum_of_digit(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		return sum;
	}

}
