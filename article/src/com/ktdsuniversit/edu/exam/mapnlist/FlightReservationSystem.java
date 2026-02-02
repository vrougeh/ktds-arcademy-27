package com.ktdsuniversit.edu.exam.mapnlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
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
	list	map
		map


 */

public class FlightReservationSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Map<String, Flight> flightMap = new HashMap<>();
		
		//반복문 내에서 사용될 변수들을 미리 선언
		String destInput;
		List<Flight> foundFlights;
		String flightName;
		Flight selectedFlight;
		List<FlightSeet> seats;
		
		//1. 대량의 비행기 데이터 자동 생성 (초기화)
		initializeFlightData(flightMap);
		//해당 비행기들 리스트 출력
		printAllFlights(flightMap);

		while (true) {
			System.out.println("목적지를 입력하면 비행기 편을 예약할 수 있습니다.");
			System.out.print("목적지를 입력하세요: ");
			
			destInput = scanner.nextLine().trim();
			
			// 목적지로 비행기 검색
			foundFlights = new ArrayList<>(); // 리스트 객체는 새로 생성해야 비워진 상태로 시작
			for (Flight f : flightMap.values()) {
				if (f.getDestination().equals(destInput)) {
					foundFlights.add(f);
				}
			}
			
			if (foundFlights.isEmpty()) {
				System.out.println("\"" + destInput + "\"행 비행기 편은 존재하지 않습니다.\n");
				continue;
			}
			
			//검색 결과 출력
			System.out.println("\"" + destInput + "\"행 비행기편은 아래와 같습니다.");
			for (Flight f : foundFlights) {
				System.out.println("\"" + f.getName() + "편\" 예매가능 좌석 수: " + f.getAvailableSeatCount());
			}
			System.out.println(); 
			
			//비행기 선택 및 예약 루프
			while (true) {
				System.out.print("비행기 편을 입력하세요: ");
				
				flightName = scanner.nextLine().trim();
				
				selectedFlight = flightMap.get(flightName);
				
				//입력 검증
				if (selectedFlight == null || !selectedFlight.getDestination().equals(destInput)) {
					System.out.println("\"" + flightName + "\" 편은 존재하지 않거나 해당 목적지행이 아닙니다.");
					System.out.print("다른 ");
					continue;
				}
				
				// 좌석 현황 출력
				seats = selectedFlight.getSeet();
				printSeatStatus(selectedFlight.getName(), seats);
				
				// 만석 체크
				if (selectedFlight.getAvailableSeatCount() == 0) {
					System.out.println("예약 가능한 좌석이 없습니다. 다른 비행기 편을 이용해 주세요.");
					break; 
				}
				
				//예약 진행
				processReservation(scanner, selectedFlight);
				break; 
			}
		}
	}
	
	// --- Methods ---
	
	//전체 비행기 리스트 출력 메소드
	public static void printAllFlights(Map<String, Flight> flightMap) {
		System.out.println("\n=== 전체 비행기 리스트 (" + flightMap.size() + "개) ===");
		System.out.println("-------------------------------------");
		
		List<Flight> allFlights = new ArrayList<>(flightMap.values());
		
		Collections.sort(allFlights, new Comparator<Flight>() {
			@Override
			public int compare(Flight f1, Flight f2) {
				return f1.getName().compareTo(f2.getName());
			}
		});
		
		for (Flight f : allFlights) {
			System.out.printf("[%s편] %-4s (잔여:%d)  ", 
					f.getName(), f.getDestination(), f.getAvailableSeatCount());
			
			if (Integer.parseInt(f.getName()) % 4 == 0) {
				System.out.println();
			}
		}
		System.out.println("\n-------------------------------------\n");
	}

	//비행기 데이터 생성 메소드
	public static void initializeFlightData(Map<String, Flight> flightMap) {
		String[] destinations = {"미국", "중국", "일본", "독일", "프랑스", "이탈리아", "부산", "제주", "다낭", "방콕"};
		Random random = new Random();
		
		// 15개의 비행기 편 생성 (테스트용)
		for (int i = 1; i <= 15; i++) {
			String flightName = String.format("%04d", i);
			String dest = destinations[random.nextInt(destinations.length)];
			List<FlightSeet> seats = createRandomSeats();
			flightMap.put(flightName, new Flight(flightName, dest, seats));
		}
		
		// 테스트용 만석 비행기
		List<FlightSeet> fullSeats = new ArrayList<>();
		for(int k=1; k<=9; k++) {
			fullSeats.add(new FlightSeet(k, "X"));
		}
		flightMap.put("0091", new Flight("0091", "부산", fullSeats));
	}
	
	// 랜덤 좌석 생성 메소드
	public static List<FlightSeet> createRandomSeats() {
		List<FlightSeet> seats = new ArrayList<>();
		Random random = new Random();
		
		for (int i = 1; i <= 9; i++) {
			String status = (random.nextDouble() < 0.3) ? "X" : "O";
			seats.add(new FlightSeet(i, status));
		}
		return seats;
	}
	
	// 예약 처리 로직
	public static void processReservation(Scanner scanner, Flight flight) {
		List<FlightSeet> seats = flight.getSeet();
		
		int seatNum;
		String input;
		FlightSeet selectedSeat;
		String confirm;
		
		while(true) {
			System.out.print("좌석 예약을 하려면 번호를 입력하세요: ");
			try {
				input = scanner.nextLine().trim();
				seatNum = Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요.");
				continue;
			}
			
			if (seatNum < 1 || seatNum > seats.size()) {
				System.out.print("\"" + seatNum + "\"번은 존재하지 않는 좌석입니다. 다른 좌석을 입력하세요: ");
				continue;
			}
			
			selectedSeat = seats.get(seatNum - 1);
			
			if (selectedSeat.getSeetable().equals("X")) {
				System.out.print("\"" + seatNum + "\"번 좌석은 이미 예약된 좌석입니다. 다른 좌석을 입력하세요: ");
				continue;
			}
			
			System.out.print("\"" + seatNum + "\"번 좌석을 예약하시겠습니까? (y/N): ");
			confirm = scanner.nextLine().trim();
			
			if (confirm.equalsIgnoreCase("y")) {
				selectedSeat.setSeetable("X");
				System.out.println("\"" + seatNum + "\"번 좌석이 예약되었습니다.");
				printSeatStatus(flight.getName(), seats);
				break;
			} else {
				System.out.println("예약이 취소되었습니다.");
				break;
			}
		}
	}
	
	public static void printSeatStatus(String flightName, List<FlightSeet> seats) {
		System.out.println();
		System.out.println("\"" + flightName + "\" 편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)");
		for (int i = 0; i < seats.size(); i++) {
			FlightSeet seat = seats.get(i);
			System.out.print(seat.getNumber() + ": " + seat.getSeetable());
			if (i < seats.size() - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("\n");
	}
}