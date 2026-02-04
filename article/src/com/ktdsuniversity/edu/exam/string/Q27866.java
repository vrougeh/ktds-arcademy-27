package com.ktdsuniversity.edu.exam.string;

import java.util.Scanner;
// charAt(), subString
// 단어 S와 정수 i가 주어졌을때 S의 i번째 글자를 출력하는 프로글매을 작성하시오
public class Q27866 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		int number = scanner.nextInt();
		
		
		
		System.out.println(word.substring(number-1,number));
		System.out.println(word.charAt(number-1));
		
		

	}

}
