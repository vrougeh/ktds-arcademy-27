package com.ktdsuniversit.edu.exam.array;

public class Q2562 {

	public static void main(String[] args) {
		int[] arr = {3, 29, 38, 12, 57, 74, 40, 85, 61};
		
		int count = 0;
		int bigNum = 0;
		
		for(int i = 0; i < arr.length ; i++) {
			if(bigNum < arr[i]) {
				bigNum = arr[i];
				count = i+1;
			}
		}
		
		System.out.println(bigNum);
		System.out.println(count);
		
		
		
	}

}
