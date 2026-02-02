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


과제 2
목적지를 입력하면 비행기 편을 예약할 수 있습니다.
목적지를 입력하세요: 인도
"인도"행 비행기 편은 존재하지 않습니다.
 
목적지를 입력하세요: 부산
"부산"행 비행기편은 아래와 같습니다.
"0001편" 예매가능 좌석 수: 4
"0091편" 예매가능 좌석 수: 0
"0100편" 예매가능 좌석 수: 10
 
비행기 편을 입력하세요: 0091
"0091" 편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)
1: X, 2: X, 3: X, 4: X, 5: X, 6: X, 7: X, 8: X, 9: X
 
예약 가능한 좌석이 없습니다. 다른 비행기 편을 이용해 주세요.
다른 비행기 편을 입력하세요: 0092
"0092" 편은 존재하지 않습니다.
 
다른 비행기 편의 이름을 입력하세요: 0001
"0001" 편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)
1: O, 2: X, 3: O, 4: O, 5: X, 6: O, 7: X, 8: X, 9: X
 
좌석 예약을 하려면 번호를 입력하세요: 5
"5"번 좌석은 이미 예약된 좌석입니다. 다른 좌석을 입력하세요: 3
"3"번 좌석을 예약하시겠습니까? (y/N): y
"3"번 좌석이 예약되었습니다.
 
"0001" 편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)
1: O, 2: X, 3: X, 4: O, 5: X, 6: O, 7: X, 8: X, 9: X
 
목적지를 입력하면 비행기 편을 예약할 수 있습니다.
목적지를 입력하세요: 다낭

배열 X	

//Map, List를 이용해 비행기 좌석 예매 시스템을 만드세요.
좌석 - 비행기편 - 목적지
list  list    string
	list	string
		map
 */

public class FlightReservationSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//[구조 변경] Key: 목적지(String), Value: 그곳으로 가는 비행기 리스트(List<Flight>)
		Map<String, List<Flight>> flightMap = new HashMap<>();
		
		// 변수 선언
		String destInput; // 입력한 목적지
		List<Flight> flightListForDest; // 해당 목적지의 비행기 리스트
		String flightName;  // 비행기 편명
		Flight selectedFlight; // 선택된 비행기
		List<FlightSeet> seats; // 좌석
		
		//1. 데이터 초기화
		initializeFlightData(flightMap);
		
		//2. 전체 리스트 출력
		printAllFlights(flightMap);
		
		while (true) {
			System.out.println("목적지를 입력하면 비행기 편을 예약할 수 있습니다.");
			System.out.print("목적지를 입력하세요: ");
			
			destInput = scanner.nextLine().trim();
			
			
			if (!flightMap.containsKey(destInput)) {
				System.out.println("\"" + destInput + "\"행 비행기 편은 존재하지 않습니다.\n");
				continue;
			}
			
			//해당 목적지로 가는 비행기 리스트 가져오기
			flightListForDest = flightMap.get(destInput);
			
			//검색 결과 출력
			System.out.println("\"" + destInput + "\"행 비행기편은 아래와 같습니다.");
			for (Flight f : flightListForDest) {
				System.out.println("\"" + f.getName() + "편\" 예매가능 좌석 수: " + f.getAvailableSeatCount());
			}
			System.out.println();
			
			//비행기 선택 및 예약 루프
			while (true) {
				System.out.print("비행기 편을 입력하세요: ");
				flightName = scanner.nextLine().trim();
				if(flightName == "exit") {
					break;
				}
				//리스트 안에서 입력한 편명의 비행기를 찾아야 함
				selectedFlight = null;
				for (Flight f : flightListForDest) {
					if (f.getName().equals(flightName)) {
						selectedFlight = f;
						break;
					}
				}
				
				//입력 검증
				if (selectedFlight == null) {
					System.out.println("\"" + flightName + "\" 편은 \"" + destInput + "\"행 비행기가 아닙니다.");
					System.out.print("다른 ");
					continue;
				}
				
				//좌석 현황 출력
				seats = selectedFlight.getSeet();
				printSeatStatus(selectedFlight.getName(), seats);
				
				//만석 체크
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
	
	//전체 비행기 리스트 출력 메소드 (Map<String, List<Flight>>)
	public static void printAllFlights(Map<String, List<Flight>> flightMap) {
		System.out.println("\n=== 전체 비행기 리스트 (" + flightMap.size() + "개 목적지) ===");
		System.out.println("-------------------------------------");
		
		//목적지(Key) 목록을 가져와서 정렬
		List<String> destinations = new ArrayList<>(flightMap.keySet());
		Collections.sort(destinations);
		
		for (String dest : destinations) {
			//해당 목적지의 비행기 리스트 가져오기
			List<Flight> flights = flightMap.get(dest);
			
			System.out.println("[" + dest + " 행]");
			for (Flight f : flights) {
				System.out.printf("  %s편 (잔여:%d)", f.getName(), f.getAvailableSeatCount());
			}
			System.out.println("\n");
		}
		System.out.println("-------------------------------------\n");
	}

	//비행기 데이터 대량 생성 메소드
	public static void initializeFlightData(Map<String, List<Flight>> flightMap) {
		String[] destinations = {"미국", "중국", "일본", "독일", "프랑스", "이탈리아", "부산", "제주", "다낭", "방콕"};
		Random random = new Random();
		
		//30개의 비행기 편 생성
		for (int i = 1; i <= 30; i++) {
			String flightName = String.format("%04d", i);
			String dest = destinations[random.nextInt(destinations.length)];
			List<FlightSeet> seats = createRandomSeats();
			
			//Map에 해당 목적지 키가 없으면 새 리스트 생성해서 넣음
			if (!flightMap.containsKey(dest)) {
				flightMap.put(dest, new ArrayList<>());
			}
			
			// 해당 목적지 리스트에 비행기 추가
			flightMap.get(dest).add(new Flight(flightName, seats));
		}
		
		//테스트용 만석 비행기 (부산행 리스트에 추가)
		List<FlightSeet> fullSeats = new ArrayList<>();
		for(int i=1; i<=9; i++) {
			fullSeats.add(new FlightSeet(i, "X"));
		}
		
		//부산 키가 없으면 생성
		if (!flightMap.containsKey("부산")) {
			flightMap.put("부산", new ArrayList<>());
		}
		flightMap.get("부산").add(new Flight("0091", fullSeats));
	}
	
	//랜덤 좌석 생성 메소드
	public static List<FlightSeet> createRandomSeats() {
		List<FlightSeet> seats = new ArrayList<>();
		Random random = new Random();
		
		for (int i = 1; i <= 9; i++) {
			String status = (random.nextDouble() < 0.3) ? "X" : "O";
			seats.add(new FlightSeet(i, status));
		}
		return seats;
	}
	
	//예약 처리 로직
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