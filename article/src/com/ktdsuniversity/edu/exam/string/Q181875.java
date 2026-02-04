package com.ktdsuniversity.edu.exam.string;

import java.util.Scanner;

public class Q181875 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] strArr = null;
		
		String str = scanner.nextLine();
		strArr = str.split(" ");
		
		for(int i = 0 ; i < strArr.length ; i++) {
			if(i % (double)2 == 0) {
				strArr[i] = strArr[i].toLowerCase();
			}else {
				strArr[i] = strArr[i].toUpperCase();
			}
		}
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] +" ");
		}

	}

}
