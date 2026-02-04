package com.ktdsuniversity.edu.exam.array;

import java.util.Scanner;

//https://www.acmicpc.net/problem/10798 
// TODO 좀더 구상 필요
public class Q10798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] str = sc.nextLine().split("");
		
//		System.out.println(Arrays.toString(str));
		
		int len = str.length;
//		System.out.println(len);
		
		
		String[][] matrix = new String[5][len];
		
//		for(int i = 0 ; i < 5 ; i++ ) {
//			for(int j = 0 ; j < len ; j++) {
//				System.out.println(matrix[i][j]);
//			}
//		}
		
		
		int newlen = len;
		
		for(int i = 0 ; i < 5 ; i++ ) {
//			System.out.println("str.lengh \t" + str.length);
			if(str.length <= len) {
				newlen = len;
				len = str.length;
			}
//			System.out.println("len \t" +len);
			for(int j = 0 ; j < len ; j++) {
//				System.out.print(str[j] + "\t");
//				System.out.println("i \t" + i);
				matrix[i][j] = str[j];
				}
			str = sc.nextLine().split("");
//			System.out.println(Arrays.toString(str));
			len = newlen;
		}
//		System.out.println(Arrays.deepToString(matrix));
		
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0; j <len ; j++) {
				System.out.print(matrix[j][i]);
			}
		}
		
//		System.out.print(matrix[0][1]);
	}

}
