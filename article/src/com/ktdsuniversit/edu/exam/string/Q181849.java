package com.ktdsuniversit.edu.exam.string;

import java.util.Scanner;

public class Q181849 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String num_str = scanner.nextLine();
		
		//0을 빼는 코드
		String new_num_str = num_str.replace("0","");
		
		String[] str =  new_num_str.split("");
		
		int sum = 0;
		
		for(int i = 0 ; i < str.length; i++) {
			sum += Integer.parseInt(str[i]);
		}
		
		System.out.println(sum);

	}

}
