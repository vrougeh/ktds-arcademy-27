package com.ktdsuniversit.edu.exam.string;

import java.util.Scanner;
//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오
public class Q11720 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String num1 = scanner.nextLine();
		
		String num2 = scanner.nextLine();
		
		String sum;
		int realsum = 0;
		if(num2.length()== Integer.parseInt(num1) ) {
			for(int i = 0; i < Integer.parseInt(num1); i++) {
				sum = num2.charAt(i) + "";
				
				realsum += Integer.parseInt(sum);
			}
			System.out.println(realsum);
		}else {
			System.out.println("숫자의 크기가 맞지 않습니다.");
		}

	}

}
