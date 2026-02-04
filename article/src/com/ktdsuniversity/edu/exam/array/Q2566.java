package com.ktdsuniversity.edu.exam.array;

public class Q2566 {
	public static void main(String[] args) {
		int[][] matrix = new int[9][9];
		
		//랜덤값 입력
		for (int i = 0 ; i < matrix[0].length ; i++) {
			for(int j = 0 ; j < matrix[0].length ; j++) {
				matrix[i][j] = (int) (Math.random() * 100);
			}
		}
		
		int row = 0;
		int col = 0;
		int result = matrix[0][0];// 최초 0,0 이 제일 클 경우
		
		for (int i = 0 ; i < matrix[0].length ; i++) {
			for(int j = 0 ; j < matrix[0].length ; j++) {
				if(result < matrix[i][j]) { 
					row = i+1;
					col = j+1;
					result = matrix[i][j];
				}
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println(result);
		System.out.println(row +" " + col);
		
	}

}
