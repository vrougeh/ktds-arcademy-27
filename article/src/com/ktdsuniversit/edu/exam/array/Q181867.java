package com.ktdsuniversit.edu.exam.array;

import java.util.Arrays;

public class Q181867 {
	public static void main(String[] args) {
//		String myString = "xabcxdefxghi";
		String myString = "oxooxoxxox"; // x가 맨 마지막에 있을때 "" 생성 필요
		String[] stringResult = {};
		
		if(myString.endsWith("x")) {
			myString += " ";
		}
		
		stringResult = myString.split("x");
		
		System.out.println(Arrays.toString(stringResult));
		
		int[] result = new int[stringResult.length];
		
		for(int i = 0 ; i < stringResult.length ; i++) {
			result[i] = stringResult[i].trim().length();
		}
		
		
		System.out.println(Arrays.toString(result));
		
		
	}

}
