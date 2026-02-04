package com.ktdsuniversity.edu.exam.array;

import java.util.Arrays;

public class Q181869 {
	public static void main(String[] args) {
		String my_string = "i love you";
//		String my_string = "programmers";
		
		String[] result = my_string.trim().split(" ");
		
		System.out.println(Arrays.toString(result));
		
	}

}
