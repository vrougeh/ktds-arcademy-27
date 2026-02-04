package com.ktdsuniversity.edu.exceptions;


public class TryExam {
	
	public static void handleException() {
		
		try {
			Class.forName("com.ktdsuniversity.edu.exceptions.TryExam");
			
		}catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}
	
	public static void numberFormatExam(String str) {
		
		if(str != null) {
			int value = 0;
			try {
				System.out.println("변환전");
				value = Integer.parseInt(str); //예외 발생 가능성 높음
				System.out.println("변환후");
			}
			catch(NumberFormatException nfe){ 
				System.out.println(nfe.getMessage());
				nfe.printStackTrace(); //에러 발생 원인 출력
				
			}
			System.out.println(value);
		}
	}
	
	public static void main(String[] args) {
		numberFormatExam("123456");
		numberFormatExam("646");
		numberFormatExam("asdf");
		numberFormatExam("100000000000000000000");
		numberFormatExam("123456");
		
		handleException();
	}

}
