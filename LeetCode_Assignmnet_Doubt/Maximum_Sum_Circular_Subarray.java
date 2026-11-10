package LeetCode_Assignmnet_Doubt;

public class Maximum_Sum_Circular_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, -2, 3, -2 };

	}

	public static int Circular_Sum(int[] arr) {
		int linear_sum = kadanes_Algorithm(arr);
		int total_sum = 0;
		for (int i = 0; i < arr.length; i++) {
			total_sum += arr[i];
			arr[i] = arr[i] * -1;
		}
		int mid_sum = kadanes_Algorithm(arr);
		int circular_sum = total_sum + mid_sum;
		if(circular_sum==0) {
			return linear_sum;
		}
		return Math.max(linear_sum, circular_sum);

	}

	public static int kadanes_Algorithm(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return ans;

	}

}
