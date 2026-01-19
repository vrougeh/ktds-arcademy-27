package java_exam;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		
//		int inputNumber = 0;
//		
//		while(inputNumber <= 100) {
//			inputNumber = keyboard.nextInt();
//			System.out.println(inputNumber);
//		}
//		System.out.println("종료");
		
		
		
		
		
		double randomNumber = Math.random();
		
		int answer = (int)(randomNumber * 100);
		int value = 0;
		
		while(true) {
			System.out.println("숫자 입력");
			value = keyboard.nextInt();
			if(answer == value) {
				System.out.println("정답");
				break;
			}else if(answer > value) {
				System.out.println("UP");
			}else {
				System.out.println("down");
			}
		}
		

	}

}
