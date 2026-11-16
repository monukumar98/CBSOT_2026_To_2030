package Lec23;

public class Wrapper_Clas {
	public static void main(String[] args) {
		int a = 10;
		Integer a1 = 10;
		System.out.println(a);
		System.out.println(a1);

		Long l1 = 10l;

		// Auto-Boxing
		a1 = a;
		// un-Boxing
		long ll = l1;
		Integer c1 = 18;
		Integer c2 = 18;
		Integer c3 = 181;
		Integer c4 = 181;
		System.out.println(c1 == c2);
		System.out.println(c3 == c4);
		Boolean b1 =false;
		Boolean b2 =false;
		System.out.println(b1==b2);

	}

}
