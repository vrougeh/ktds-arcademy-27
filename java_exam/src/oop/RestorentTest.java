package oop;
/*
 *  손님이 식당에 들어와서 메뉴를 시키고 밥을 먹고 계산을 하고 나가는 과정
 *  
 *  손님 종업원 요리사
 * 
 * 키오스크 주방order기기 퇴식구
 * 
 * 계산
 */
public class RestorentTest {
	
	public static void main(String[] args) {
		
		Restorent test = new Restorent();
		
		// 줄서있는 손님의 팀을 세팅
		test.setGustTeamCount(25);

		// 이번에 입장할 팀의 손님수 세팅
		test.setGuestCount(4);
		System.out.println("남은 팀 수 : "+ test.getGustTeamCount());
		System.out.println("해당 팀의 손님의 수 : "+ test.getGuestCount());
		//손님 입장
		test.enterGuest(1);
		System.out.println("테이블 번호 : "+test.getTableCount());
		
//		test.enterGuest(2);
//		boolean a = test.table[1];
//		System.out.println(a);
		//음식 주문	
		//요리시작
		//음식나옴
		//식사
		
		
		//결제
		test.payMoney();
		//나가기
		
		System.out.println("남은 팀 수 : "+ test.getGustTeamCount());
		System.out.println("해당 팀의 손님의 수 : "+ test.getGuestCount());
		System.out.println("테이블 번호 : "+test.getTableCount());
		System.out.println("해당 매장의 총 매출 수 : "+test.getTotalCost());

		
	}

}
