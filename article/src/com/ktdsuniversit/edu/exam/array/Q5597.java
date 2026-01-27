package com.ktdsuniversit.edu.exam.array;

import java.util.Arrays;

public class Q5597 {

	public static void main(String[] args) {
		int[] arr = {3,1,4,5,7,9,6,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
		
		Arrays.sort(arr);
		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(arr.length);
		
		int[] result = new int[arr.length];
		int count = 0;
		
		for(int i = 0 ; i < arr.length-1 ; i++) {
			if(arr[i] != arr[i+1] - 1) {
				result[count++] = arr[i]+1;
			}
		}

		System.out.println(result[0]);
		System.out.println(result[1]);
	}

}
