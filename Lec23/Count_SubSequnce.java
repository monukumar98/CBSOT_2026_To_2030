package Lec23;

public class Count_SubSequnce {

	public static void main(String[] args) {
		String ques = "abc";

		System.out.println("\n" + Count_Subsequnec(ques, ""));

	}

	public static int Count_Subsequnec(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.print(ans + " ");
			return 1;
		}

		char ch = ques.charAt(0);
		int x = Count_Subsequnec(ques.substring(1), ans);
		int y = Count_Subsequnec(ques.substring(1), ans + ch);
		return x + y;

	}

//	static int c = 0;
//	
//	public static void Print(String ques, String ans) {
//		if (ques.length() == 0) {
//			c++;
//			System.out.print(ans + " ");
//			return;
//		}
//		
//		char ch = ques.charAt(0);
//		Print(ques.substring(1), ans);
//		Print(ques.substring(1), ans + ch);
//		
//	}

}
