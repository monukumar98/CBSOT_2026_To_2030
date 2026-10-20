package Lec14;

public class Peak_Index_in_a_Mountain_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 10, 5, 2 };
		System.out.println(Peak_Index(arr));
	}

	public static int Peak_Index(int[] arr) {
		int lo=1;
		int hi=arr.length-2;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(arr[mid]>arr[mid-1]&& arr[mid]>arr[mid+1]) {
				return mid;
			}
			else if(arr[mid]>arr[mid-1]) {
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return -1;

	}

}
