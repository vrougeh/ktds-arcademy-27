package com.ktdsuniversit.edu.exam.inheritance;

public class ConvenienceStore extends Store {
	private int point;

	public ConvenienceStore(int store, int money, int money2, int point) {
		super(store, money, money2);
		this.point = point;
	}

}
