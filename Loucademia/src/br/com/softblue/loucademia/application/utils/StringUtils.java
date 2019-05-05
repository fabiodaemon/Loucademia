package br.com.softblue.loucademia.application.utils;

public class StringUtils {

	public static boolean isEmpty(String s) {
		
		if (s == null) {
			return true;
		}
		
		return s.trim().length() == 0;
		
	}
	
	// colocar zeros a esquerda complementando. O "d" significa que vai virar numero
	public static String leftZeroes(int value, int finalSize) {
		
		return String.format("%0" + finalSize + "d", value);
		
	}
	
	public static void main(String[] args) {
		
		String str = "abc";
		
		boolean b = StringUtils.isEmpty(str);
		
		System.out.println(b);
		
		int v = 12345;
		System.out.println(StringUtils.leftZeroes(v, 8));
	}
}
