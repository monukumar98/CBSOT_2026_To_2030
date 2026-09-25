package Lec9;

public class Function_Demo3 {
	static int val = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		int a = 8;
		int b = 7;
//		int x=sum(b,a);
//		System.out.println(x);
		System.out.println(val);// 100
		System.out.println(sum(a, b));// 22
		System.out.println(val);//
		System.out.println("Bye");
	}

	public static int sum(int a, int b) {

		int c = a + b;
		int val=70;
		Function_Demo3.val = Function_Demo3.val - 5;
		return c + sub(c, a);
	}

	public static int sub(int a, int b) {

		int c = a - b;
		return c;
	}

}
