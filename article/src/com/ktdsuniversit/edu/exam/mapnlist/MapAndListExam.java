package com.ktdsuniversit.edu.exam.mapnlist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 과제 1
비행기 편의 이름을 입력하면, 좌석 현황을 볼 수 있습니다.
비행기 편의 이름을 입력하세요:  0001
 
"0001" 편은 존재하지 않습니다.
다른 비행기 편의 이름을 입력하세요: "0002"
 
"0002" 편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)
1: O, 2: O, 3: O, 4: O, 5: X, 6: O, 7: O, 8: O, 9: O
 
좌석 예약을 하려면 번호를 입력하세요: 5
"5"번 좌석은 이미 예약된 좌석입니다. 다른 좌석을 입력하세요: 3
"3"번 좌석을 예약하시겠습니까? (y/N): y
"3"번 좌석이 예약되었습니다.
 
"0002" 편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)
1: O, 2: O, 3: X, 4: O, 5: X, 6: O, 7: O, 8: O, 9: O
 
비행기 편의 이름을 입력하면, 좌석 현황을 볼 수 있습니다.
비행기 편의 이름을 입력하세요:  0003
"0003" 편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)
1: X, 2: X, 3: X, 4: X, 5: X, 6: X, 7: X, 8: X, 9: X
 
예약 가능한 좌석이 없습니다. 다른 비행기 편을 이용해 주세요.
비행기 편의 이름을 입력하면, 좌석 현황을 볼 수 있습니다.
비행기 편의 이름을 입력하세요:  0004
....

배열 X

//Map, List를 이용해 비행기 좌석 예매 시스템을 만드세요.
좌석 - 비행기편 - 목적지
list  list    string
			map
	map


 */

public class MapAndListExam {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Map<Integer, List<FlightSeet>> flights = setFlight();
		
		
		System.out.println("비행기 편의 이름을 입력하면, 좌석 현황을 볼 수 있습니다.");
		System.out.print("비행기 편의 이름을 입력하세요 : ");
		
		while(true) {
			int flightNumber = sc.nextInt();
			
			if(flights.containsKey(flightNumber)) {
				System.out.println("일치");
				System.out.println(flightNumber + "편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)");
				for(int i = 0 ; i < flights.size() ; i++) {
					System.out.print(i + ": " + flights.getSeet);
				}
			}else {
				System.out.println( flightNumber + " 편은 존재하지 않습니다. \n 다음 비행기 편의 이름을 입력하세요: ");
			}
		}
		
	}
	
	
	public static Map<Integer, List<FlightSeet>> setFlight() {
		
		
//		Map<String, List<Flight>> flights = new HashMap<>();
//		
//		flights.put("부산", new ArrayList<>());
//		flights.put("인도", new ArrayList<>());
//		flights.put("서울", new ArrayList<>());
//		flights.put("제주도", new ArrayList<>());
//		
//		

		Map<Integer, List<FlightSeet>> flight = new HashMap<>(); // 비행기편 , 좌
		flight.put(0001, new ArrayList<>());
		flight.put(0002, new ArrayList<>());
		flight.put(0003, new ArrayList<>());
		flight.put(0004, new ArrayList<>());
		flight.put(0005, new ArrayList<>());
		
		
		List<FlightSeet> seet = flight.get(0001);
		seet.add(new FlightSeet(1, "0"));
		seet.add(new FlightSeet(2, "0"));
		seet.add(new FlightSeet(3, "0"));
		seet.add(new FlightSeet(4, "0"));
		seet.add(new FlightSeet(5, "0"));
		seet.add(new FlightSeet(6, "0"));
		seet.add(new FlightSeet(7, "0"));
		seet.add(new FlightSeet(8, "0"));
		seet.add(new FlightSeet(9, "0"));
		
		
		System.out.println(flight);
		return flight;
	}
	

}
