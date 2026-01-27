package com.ktdsuniversit.edu.string;


public class StringConcat {
//String 연산은 부담을 준다
	public static void main(String[] args) {
		String  abcd = "awenorijoasdfjlk;";
		
		for(int i = 0 ; i < 20 ; i++ ) {
			abcd += abcd;
		}
		
		System.out.println("완료");
	}

}
