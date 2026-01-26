package com.ktdsuniversit.edu.exam.string;

import java.util.Scanner;

public class Q181843 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String my_string = scanner.nextLine();
		String target = scanner.nextLine();
		
		
		if(my_string.contains(target)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}

}
