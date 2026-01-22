package oop;

/*
 * 함바집 사장님 관점에서 
 */
public class Restorent {
	//TODO 4인 1table 구현
	int guestCount;
	int guestTeamCount;
	int totalTableCount;
	int tableNumber;
	boolean[] table = new boolean[totalTableCount];
	int cost;
	int totalCost;
	
	
	public Restorent(int totalTableCount, int cost) {
		this.totalTableCount = totalTableCount;
		this.cost = cost;
		
	}
	
	
	/**
	 * 손님의 총 팀 세팅
	 */
	public void setGuestTeamCount(int num) {
		guestTeamCount = num;
	}
	
	public int getGuestTeamCount() {
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
