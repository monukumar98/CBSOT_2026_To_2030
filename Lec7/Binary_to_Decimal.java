package Lec7;

public class Binary_to_Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1001110;
		int sum = 0;
		int mul = 1;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem * mul;
			n = n / 10;
			mul = mul * 2;
		}
		System.out.println(sum);
	}

}
