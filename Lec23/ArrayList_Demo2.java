package Lec23;

import java.util.ArrayList;

public class ArrayList_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(1, -4);
		ll.add(2);
		ll.add(3);
		ll.add(21);
		ll.add(13);
		ll.add(-2);
		ll.add(4);
		System.out.println(ll);
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");

		}
		System.out.println();
		int[] arr = new int[4];

		for (int x : ll) {
			System.out.print(x + " ");
		}
		System.out.println();
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}

}
