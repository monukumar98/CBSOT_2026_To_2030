package Lec6;

public class Is_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4554;
		int a=n;
		int rev = 0;
		while (n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		
		if(rev==a) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("No Palindrome");
		}
		
	}

}
