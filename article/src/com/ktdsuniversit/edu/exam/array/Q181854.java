package com.ktdsuniversit.edu.exam.array;

import java.util.Arrays;

public class Q181854 {

	public static void main(String[] args) {
		int[] arr = {444, 555, 666, 777};
		int n = 100;
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr.length % 2 == 0) { //짝수일 경우 홀수 인덱스에 n값 더하기
				if(i % 2 != 0) {
					arr[i] += n;
				}
			}else {
				if(i % 2 == 0) {
					arr[i] += n;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
