package StringClass;

import java.util.StringTokenizer;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String java = new String("JAVA,C++");
		String cpp = new String("CPP");
		
		if(java.compareTo(cpp) < 0){
			System.out.println("CPP");
		}else{
			System.out.println("JAVA");
		}
			
		int count =0;
		
		for (int i = 0; i < java.length(); i++) {
			if(java.charAt(i)=='A')
				count++;
		}
		System.out.println(count);
		
		String s[] = java.split(",");
		
		for (int i = 0; i < s.length; i++) {
			System.out.println("ºÐ¸®µÈ ¹®ÀÚ¿­ : "+ s[i]);
		}
		
		StringTokenizer st = new StringTokenizer("È«±æµ¿/ÀåÈ­/ÄáÁã", "/");
		
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		
		
	}

}
