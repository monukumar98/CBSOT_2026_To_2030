package Lec16;

public class Book_Allocation_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] page = { 10, 20, 30, 40 };
		int student = 2;

	}

	public static int Book_Allocation(int[] page, int student) {
		int lo = 0;
		int hi = 0;
		for (int i = 0; i < page.length; i++) {
			hi = hi + page[i];
		}
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitpossible(page, student, mid)) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return ans;
	}

	public static boolean isitpossible(int[] page, int student, int mid) {
		// TODO Auto-generated method stub
		int s = 1;
		int readpage = 0;
		for (int i = 0; i < page.length;) {
			if (readpage + page[i] <= mid) {
				readpage += page[i];
				i++;
			} else {
				s++;
				readpage = 0;
			}
			if (s > student) {
				return false;
			}
		}
		return true;

	}

}
