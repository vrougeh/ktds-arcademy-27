package com.ktdsuniversity.edu.exam.array;

public class Q181856 {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {3, 3, 3, 3, 3};
		
		// arr1 > arr2 return 1
		// arr2 > arr1 return -1
		// arr1 == arr2 return 0
		
		int num1 = 0;
		int num2 = 0;
		
		if(arr1.length > arr2.length) {
			System.out.println(1);
		}else if(arr1.length > arr2.length) {
			System.out.println(-1);
		}else {
			for(int i = 0 ; i < arr1.length ; i++) {
				num1 += arr1[i];
				num2 += arr2[i];
			}
			if(num1 > num2) {
				System.out.println(1);
			}else if(num2 > num1) {
				System.out.println(-1);
			}else {
				System.out.println(0);
			}
		}
	}
	

}
