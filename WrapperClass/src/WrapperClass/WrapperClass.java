package WrapperClass;

import java.util.StringTokenizer;

public class WrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1
		Integer n = 20;
		String s1 = n.toString();
		System.out.println(s1);
		
		// 2
		String s2 = new String("35.9");
		Double d = Double.parseDouble(s2);
		System.out.println(d);

		// 3
		String s3 = new String("true");
		boolean b = Boolean.parseBoolean(s3);
		System.out.println(b);
		
		// 4
		int n2=30;
		String s4 = Integer.toBinaryString(n2);
		System.out.println(s4);
		
		// 5
		char c = 'c';
		String s5 = Character.toString(c);
		
		System.out.println();
		
		// StringTokenizer
		StringTokenizer st = new StringTokenizer("박웅기/컴퓨터공학과;201535018", "/;", true);
		
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}

}
