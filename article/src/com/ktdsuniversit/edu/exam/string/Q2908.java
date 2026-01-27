package com.ktdsuniversit.edu.exam.string;

import java.util.Scanner;

//
//for charAt Integer.parseInt split
public class Q2908 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		String[] splitStr = str.split(" ");
		
		String num1 = splitStr[0];
		String num2 = splitStr[1];
		
//		int num1 = Integer.parseInt(splitStr[0]);
//		int num2 = Integer.parseInt(splitStr[1]);
		
//		System.out.println(num1);
//		System.out.println(num2);
		
		String result1 = "";
		String result2 = "";
		
		for(int i = 0 ; i < 3 ; i++) {
			result1 += num1.charAt(2-i);
			result2 += num2.charAt(2-i);
		}
//		System.out.println(result1);
//		System.out.println(result2);
		
		
		int num3 = Integer.parseInt(result1);
		int num4 = Integer.parseInt(result2);
		if(num3 > num4) {
			System.out.println(num3);
		}else {
			System.out.println(num4);
		}
 
	}

}
