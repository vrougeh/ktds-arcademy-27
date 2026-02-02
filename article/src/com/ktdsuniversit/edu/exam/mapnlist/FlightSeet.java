package com.ktdsuniversit.edu.exam.mapnlist;

public class FlightSeet {
	
	private int number;
	private String seetable;
	
	public FlightSeet(int number , String seetable) {
		this.number = number;
		this.seetable = seetable;
	}
	
	//TODO getter setter 만들기

	@Override
	public String toString() {
		return "FlightSeet [number=" + this.number + ", seet=" + this.seetable + "]";
	}
	
	

}
