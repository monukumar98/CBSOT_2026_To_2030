package Lec3;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = n;
		while (row <= n) {
			// star
			int i = 1;
			while (i <= star) {
				if (row == 1 || row == n || i == 1 || i == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				i++;
			}

			// Next row ki prep
			row++;
			System.out.println();
		}

	}

}
