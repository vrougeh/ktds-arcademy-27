package com.ktdsuniversit.edu.exam.mapnlist;

import java.util.List;

public class Flight {
	
	private String name; // 비행기 편명
	private List<FlightSeet> seet;
	
	public Flight(String name, List<FlightSeet> seet) {
		this.name = name;
		this.seet = seet;
	}

	public String getName() {
		return this.name;
	}

	public List<FlightSeet> getSeet() {
		return this.seet;
	}
	
	public int getAvailableSeatCount() {  // 잔여 좌석수 세기
		int count = 0;
		for (FlightSeet s : this.seet) {
			if ("O".equals(s.getSeetable())) {
				count++;
			}
		}
		return count;
	}

	@Override
	public String toString() {
		return "Flight [name=" + name + ", seet=" + seet + "]";
	}
}