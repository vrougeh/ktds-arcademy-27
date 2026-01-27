package com.ktdsuniversit.edu.exam.array;

public class Q10871 {

	public static void main(String[] args) {
		int[] numArray = {1 ,10, 4, 9, 2, 3, 8, 5, 7, 6};

		int baseNum = 5;
		
		for(int i = 0 ; i <numArray.length ; i++) {
			if(numArray[i] < baseNum) {
				System.out.print(numArray[i] + " ");
			}
		}
	}

}
