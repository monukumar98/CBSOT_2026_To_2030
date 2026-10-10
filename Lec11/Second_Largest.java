package Lec11;

public class Second_Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 5, 4, 1, 7, 6 };
		System.out.println(SecondLargest(arr));
	}

	public static int SecondLargest(int[] arr) {
		int first = arr[0];
		int sec = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > first) {
				sec = first;
				first = arr[i];
			} else if (arr[i] > sec) {
				sec = arr[i];
			}
		}
		return sec;

	}

}
