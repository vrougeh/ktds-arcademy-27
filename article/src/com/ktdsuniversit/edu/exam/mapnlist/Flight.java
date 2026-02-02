package com.ktdsuniversit.edu.exam.mapnlist;

import java.util.List;

public class Flight {
	
	private String name;		// 비행기 편명 (예: 0001)
	private String destination;	// 목적지 추가를 위해 선언함
	private List<FlightSeet> seet;
	
	public Flight(String name, String destination, List<FlightSeet> seet) {
		this.name = name;
		this.destination = destination;
		this.seet = seet;
	}

	public String getName() {
		return name;
	}
	public String getDestination() {
		return destination;
	}
	public List<FlightSeet> getSeet() {
		return seet;
	}
	
	// 예매 가능한 좌석 수 계산
	public int getAvailableSeatCount() {
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
		return "Flight [name=" + name + ", destination=" + destination + ", seet=" + seet + "]";
	}
}