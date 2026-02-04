package com.ktdsuniversity.edu.exam.array;

import java.util.Arrays;

public class Q181853 {

	public static void main(String[] args) {
		int[] numList ={12, 4, 15, 46, 38, 1, 14};

		Arrays.sort(numList);
		int[] result = new int[5];
		for (int i = 0; i < 5 ; i++) {
			result[i] = numList[i];
		}

		System.out.println(Arrays.toString(result));
		
	}

}
