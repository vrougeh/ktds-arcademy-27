package exam;

import java.util.Scanner;

public class Q2739 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q2739
		Scanner keyboard = new Scanner(System.in);
		
		int value = keyboard.nextInt();

		for(int i = 1 ;i < 10; i++ ) {
			System.out.println(value + " * " + i + " = " + value*i);
		}
		int num = 1;
		while(num < 10) {
			System.out.println(value + " * " + num + " = " + value*num);
			num++;
		}
		
		
		
		//8393
		int sum = keyboard.nextInt();
		int result = 0;
		for(int i = 0; i <= sum; i++) {
			result += i;
		}
		System.out.println(result);
		
		result = 0;
		int inc = 0;
		while(inc <= sum) {
			result += inc;
			inc++;
		}
		System.out.println(result);
		
		
		
		
		
		//25314
		int count = keyboard.nextInt();
		
		for(int i = 0; i < count/4 ; i++) {
			System.out.print("long ");
		}
		System.out.println("int");
		
		
		inc = 0;
		while(inc < count/4) {
			System.out.print("long ");
			inc++;
		}
		System.out.println("int");
		
		
		inc=0;
		String str = "";
		while(inc < count/4) {
			str += "long ";
			inc++;
		}
		str += "int";
		System.out.println(str);
		
		
		
		
		
		//2438
		int starCount = keyboard.nextInt();
		int row = 1;
		
		for(int i = 0; i < count ; i++) {
			for(int j = 0; j < row ; j++) {
				System.out.print("*");				
			}
			System.out.println();
			row++;
		}
		
		row = 1;
		while(row <= starCount) {
			int i = 0;
			while(i < row) {
				System.out.print("*");
				i++;
			}
			System.out.println();
			row++;
		}
		
		
		//2439
		row = 1;
		while(row <= starCount) {
			int i = 0;
			while(i < starCount) {
				if(i < starCount - row) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				i++;
			}
			System.out.println();
			row++;
			
		}
		
		
		row = 1;
		for(int i = 0; i < starCount ; i++) {
			for(int j = 0; j < starCount ; j++) {
				if(j < starCount - row) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
			row++;
		}
	}
}
