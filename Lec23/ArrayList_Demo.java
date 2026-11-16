package Lec23;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ll = new ArrayList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(1, -4);
		System.out.println(ll);
		// get
		System.out.println(ll.get(2));
		// remove
		System.out.println(ll.remove(1));
		System.out.println(ll);
		// update
		ll.set(1, -9);
		System.out.println(ll);
		// Sort
		Collections.sort(ll);
		System.out.println(ll);
		
	}

}







