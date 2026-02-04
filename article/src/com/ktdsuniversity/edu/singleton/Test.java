package com.ktdsuniversity.edu.singleton;

public class Test {
	public static void main(String[] args) {
		
		Me me = Me.getInstance();
		System.out.println(me);
		
		Me you = Me.getInstance();
		System.out.println(you);
		
		System.out.println(me == you);
	}
}
