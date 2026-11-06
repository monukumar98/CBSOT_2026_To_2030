package Lec19;

public class Stringbuilder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("Hello");
		sb.append(true);
		sb.append(1);
		sb.append('a');
		System.out.println(sb);
		sb.append("arpit");
		System.out.println(sb.length());
		sb.append('t');
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(2));
		System.out.println(sb.substring(1, 3));
		System.out.println(sb);
		System.out.println(sb.reverse());
		String s=sb.toString();
	}

}


