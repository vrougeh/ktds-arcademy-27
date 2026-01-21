package oop;

/*
 * 레스토랑 관리인?
 * 손님 종업원 요리사
 * 
 * 키오스크 주방order기기 퇴식구
 * 
 * 계산
 */
public class Restorent {
	
	int guestCount;
	int guestTeamCount;
	int totalTableCount = 20;
	int tableNumber;
	boolean[] table = new boolean[totalTableCount];
	int cost = 9000;
	int totalCost;
	
	
	/**
	 * 손님의 총 팀 세팅
	 */
	public void setGustTeamCount(int num) {
		guestTeamCount = num;
	}
	
	public int getGustTeamCount() {
		return guestTeamCount;
	}
	
	
	/**
	 * 손님의 수 세팅
	 */
	public void setGuestCount(int num) {
		guestCount = num;
	}
	
	public int getGuestCount() {
		return guestCount;
	}
	
	/**
	 * 테이블 수 감소
	 */
	public int setTableCount(int num) {
		boolean chk = checkTable(num);
		if(!chk) {
			return 0;
		}
		table[num] = true;
		tableNumber = num;
		return tableNumber;
	}
	
	public boolean checkTable(int num) {
		if(table[num] == true) return false;
		return true;
	}
	
	public int getTableCount() {
		return tableNumber;
	}
	
	/**
	 * 손님 입장
	 * 총 팀의 수를 하나뺌
	 * 
	 */
	public void enterGuest(int num) {
		int tableNumber = setTableCount(num);
		if(tableNumber == 0) {
			System.out.println("해당 좌석이 찼습니다. 다른 좌석을 선택하거나 대기해주세요");
		}else {
			guestTeamCount -= 1;
		}
	}
	
	
	/**
	 * 결제
	 */
	public int setUseMoney() { 
		int payMoney = guestCount * cost;
		totalCost += payMoney;
		return payMoney;
	}
	
	public void payMoney() {
		setUseMoney();
		table[tableNumber] =false;
	}
	
	public int getTotalCost() {
		return totalCost;
	}
	

}
