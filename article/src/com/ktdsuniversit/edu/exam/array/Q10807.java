package com.ktdsuniversit.edu.exam.array;

public class Q10807 {

	public static void main(String[] args) {
		int num = 11;
		int[] numArray = {1, 4, 1, 2, 4, 2, 4, 2, 3, 4, 4};
		int findnum = 2;
		
		int count = 0;
		
		for (int i = 0; i < numArray.length ; i++) {
			if(numArray[i] == findnum) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
