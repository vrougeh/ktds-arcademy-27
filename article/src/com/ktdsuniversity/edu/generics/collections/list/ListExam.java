package com.ktdsuniversity.edu.generics.collections.list;

import java.util.ArrayList;
import java.util.List;


public class ListExam {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("asd");
		names.add("asdf");
		names.add("asdg");
		names.add("asdh");
		names.add("asdi");
		names.add("asdj");
		
		System.out.println(names);
		String name = null;
		for (int i = 0 ; i < names.size(); i++) {
			name = names.get(i);
			System.out.println(name);
		}
		
		for(String names2 : names) {
			System.out.println(names2);
		}
		
		
		int[] arr = new int[] {1,2,3};
		
		for(int i = 0; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		for(int value : arr) {
			System.out.println(value);
		}
		
 	}
}
