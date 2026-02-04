package com.ktdsuniversity.edu.exceptions;

public class ExceptionExam {
	
	public static void nullExam(String str){
		
		//모든 인스턴스에서 .을 사용할때, 무조건 null을 확인해야하는가
		//.을 사용하는 인스턴스가 ㅜㅕㅣㅣ이 도리 수 있는 가능성이 조금이라도 존재할 때만 null체크 한다.
		
		
		//str이 비어있지 않으면 내용을 출력한다.
		if(str != null && !str.isEmpty()) {
			System.out.println(str);
		}else {
			System.out.println("error");
		}
		
	}

	public static void arrayIndexExam(String[] arr, int index){
		if(arr != null  && index >= 0 && index < arr.length) {
			System.out.println(arr[index]);
		}else {
			System.out.println("error");
		}
	}
	
	public static void numberFormatExam(String str){
		if(str == null) {
			System.out.println("error");
			return;
		}
		str = str.replace("_", "");
		str = str.replace(" ", "");
//		
//		if(str.length() > 10) {
//			System.out.println("범위를 벗어났습니다.");
//		} // 22억(int 최대값을 넘어가는 수)은 거르지 못함
		
		// int에 담기지 못하는 수(11자리, 22억등)은 0으로 치환
		if(str.matches("^[0-9]+${1,10}")) {
			
			long tempNum =Long.parseLong(str);
			if(tempNum > Integer.MAX_VALUE) {
				tempNum = 0;
			}
			//숫자를 정수로 변경한다.
//			int num = Integer.parseInt(str);
			int num = (int) tempNum;
			System.out.println(num);
		}else {
			System.out.println("error");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		nullExam(" sadfsfdas");
		nullExam(" ");
		nullExam("");
		nullExam(" sadf161636as");
		nullExam(null);
		
		System.out.println();
		
		arrayIndexExam(new String[] {"a","b"},0);
		arrayIndexExam(new String[] {"a","b"},1);
		arrayIndexExam(new String[] {"a","b"},2);
		arrayIndexExam(new String[] {"a","b"},-1);
		arrayIndexExam(null,-1);
		arrayIndexExam(null,0); // error
		
		System.out.println();
		
		numberFormatExam("123456");
		numberFormatExam("123_456_789");  //_없애야함
		numberFormatExam("123456789000"); //int에 담기지않음
		numberFormatExam("1.23456789000"); //.때문에 에러남 + double 타입임
		numberFormatExam("123 "); //" "없애야함
		numberFormatExam("123asd");// error
		numberFormatExam(null);// error
		
	}
}
