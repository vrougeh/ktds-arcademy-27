package com.ktdsuniversity.edu.exam.array;

import java.util.Arrays;

public class Q181861 {
	public static void main(String[] args) {
		int[] arr = {6, 6};
		
		int num = 0;
		for(int i = 0 ; i < arr.length; i++) {
			num += arr[i];
		}
		
		int[] X = new int[num];
		int k = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i] ; j++) {
				X[k++] = arr[i];
			}
		}
		System.out.println(Arrays.toString(X));
	}

}
