package LeetCode_Assignmnet_Doubt;

public class Get_the_Maximum_Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 2, 4, 5, 8, 10 };
		int[] arr2 = { 4, 6, 8, 9 };
		System.out.println(Maximum_Score(arr1, arr2));
	}

	public static int Maximum_Score(int[] arr1, int[] arr2) {
		int i = 0, j = 0, s1 = 0, s2 = 0;
		long sum = 0;
		int n = arr1.length, m = arr2.length;
		while (i < n && j < m) {
			if (arr1[i] > arr2[j]) {
				j++;
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else {
				long x = SumofArray(arr1, s1, i);
				long y = SumofArray(arr2, s2, j);
				sum += Math.max(x, y);
				i++;
				j++;
				s1 = i;
				s2 = j;
			}
		}
		long x = SumofArray(arr1, s1, n - 1);
		long y = SumofArray(arr2, s2, m - 1);
		sum += Math.max(x, y);
		sum = sum % 1000000007;
		return (int) (sum);

	}

	public static long SumofArray(int[] arr, int si, int ei) {
		long s = 0;
		for (int i = si; i <= ei; i++) {
			s += arr[i];
		}
		return s;
	}

}
