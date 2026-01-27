package com.ktdsuniversit.edu.exam.array;

import java.util.Arrays;

public class Q181868 {
	public static void main(String[] args) {
		String my_string = " i    love  you";
//		String my_string = "    programmers  ";
		
		String[] strResult = my_string.trim().split(" ");
		
//		System.out.println(Arrays.toString(strResult));
		
		/*
		 * while(result.contains("  "){
		 * 		result = result.replace("  "," ");
		 * }
		 */
		
		int count = 0;
		for(int i = 0 ; i < strResult.length ; i++) {
			if(strResult[i] != "") {
				count++;
			}
		}
		String[] result = new String[count];
		
//		System.out.println(Arrays.toString(result));
		
		for(int i = 0; i < result.length ; i++) {
			for(int j = 0 ; j < strResult.length ; j++) {
				if(strResult[j] != "") {
					result[i] = strResult[j];
					i++;
				}
			}
		}
		
		
		System.out.println(Arrays.toString(result));
		
	}

	
}
