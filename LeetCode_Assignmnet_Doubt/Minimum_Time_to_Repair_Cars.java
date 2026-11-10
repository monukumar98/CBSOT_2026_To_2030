package LeetCode_Assignmnet_Doubt;

public class Minimum_Time_to_Repair_Cars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 2, 3, 1 };
		int cars = 10;

	}

	public static int Minimum_Time(int[] arr, int cars) {
		int lo = 1;
		int hi = 0;
		for (int i = 0; i < arr.length; i++) {
			hi = Math.max(hi, arr[i]);
		}
		hi = hi * cars * cars;
		int ans = 0;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (isitpossible(arr, cars, mid)) {
				ans = mid;
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return ans;
	}

	public static boolean isitpossible(int[] arr, int cars, int mid) {
		// TODO Auto-generated method stub
		int reapaircar = 0;
		for (int i = 0; i < arr.length; i++) {
			reapaircar += Math.sqrt(mid / arr[i]);

		}
		return reapaircar >= cars;

	}

}
