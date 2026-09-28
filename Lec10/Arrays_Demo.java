package Lec10;

public class Arrays_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		System.out.println(arr);
		// update
		arr[0] = 4;
		arr[1] = 14;
		arr[2] = -3;
		arr[3] = 5;
		arr[4] = 6;
		// print 
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		//size
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}

