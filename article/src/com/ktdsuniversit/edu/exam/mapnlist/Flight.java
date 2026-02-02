package com.ktdsuniversit.edu.exam.mapnlist;

import java.util.Arrays;

public class Flight {
	
	String name;
	int number;
	int[] seet;
	
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return this.number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int[] getSeet() {
		return this.seet;
	}
	public void setSeet(int[] seet) {
		this.seet = seet;
	}
	
	public Flight(String name, int number, int[] seet) {
		this.name = name;
		this.number = number;
		this.seet = seet;
	}
	@Override
	public String toString() {
		return "Flight [name=" + name + ", number=" + number + ", seet=" + Arrays.toString(seet) + "]";
	}
	
	
	
	

}
