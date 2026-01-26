package com.ktdsuniversit.edu.exam.string;

import java.util.Scanner;

public class Q181878 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String myString = scanner.nextLine();
		String pat = scanner.nextLine();
		
		
		
		if(myString.toLowerCase().contains(pat.toLowerCase())) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}

	}

}
