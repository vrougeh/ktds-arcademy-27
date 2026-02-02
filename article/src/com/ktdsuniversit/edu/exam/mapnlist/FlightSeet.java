package com.ktdsuniversit.edu.exam.mapnlist;

public class FlightSeet {
	
	private int number; // 좌석 번호 (1~9)
	private String seetable; // 좌석 상태 ("O": 가능, "X": 불가)
	
	public FlightSeet(int number, String seetable) {
		this.number = number;
		this.seetable = seetable;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getSeetable() {
		return seetable;
	}
	public void setSeetable(String seetable) {
		this.seetable = seetable;
	}

	@Override
	public String toString() {
		return "FlightSeet [number=" + this.number + ", seetable=" + this.seetable + "]";
	}
}