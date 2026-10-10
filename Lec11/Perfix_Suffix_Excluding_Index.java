package Lec11;

public class Perfix_Suffix_Excluding_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 5, 6, 2, 4, 16, 7, 8, 9 };
		Cumlative(arr);

	}

	public static void Cumlative(int[] arr) {
		int n = arr.length;
		// perfix Excluding index
		int[] left = new int[n];
		left[0] = 1;
		for (int i = 1; i < n; i++) {
			left[i] = left[i - 1] * arr[i - 1];
		}
		// Suffix Excluding index
		int[] right = new int[n];
		right[n-1]=1;
		for (int i = n-2; i>=0; i--) {
			right[i]=right[i+1]*arr[i+1];
		}
	}

}
