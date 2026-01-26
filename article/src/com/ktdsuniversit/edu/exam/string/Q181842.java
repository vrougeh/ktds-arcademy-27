package com.ktdsuniversit.edu.exam.string;

import java.util.Scanner;
//contains
public class Q181842 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		
		
		if(str2.contains(str1)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}

}
