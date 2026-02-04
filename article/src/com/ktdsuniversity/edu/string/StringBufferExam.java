package com.ktdsuniversity.edu.string;

public class StringBufferExam {
	
	

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append(false);
		sb.append("asdfasdfasf");
		sb.append("asdfasdfasf ");
		sb.append("asdfasdfasf ");
		sb.append("asdfasdfasf");
		sb.append("asdfasdfasf");
		sb.append("asdfasdfasf");
		sb.append("asdfasdfasf");
		sb.append("asdfasdfasf");
		sb.append("asdfasdfasf");
		sb.append("02324165");
		
		String str = sb.toString();
		
		System.out.println(sb);
		
		System.out.println(str);
		
		StringBuffer longString=  new StringBuffer();
		for (int i = 0 ; i < 10000000 ; i++) {
			longString.append("asdfasdfasdfasdfasfdas");
		}
		String result = longString.toString();
		System.out.println(result);
	}

}
