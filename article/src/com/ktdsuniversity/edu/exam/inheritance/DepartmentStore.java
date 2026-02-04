package com.ktdsuniversity.edu.exam.inheritance;

//5. DepartmentStore (백화점: ConvenienceStore 상속)
public class DepartmentStore extends ConvenienceStore {

	public DepartmentStore(String storeName) {
		super(storeName);
	}
	@Override
	public int sell(Customer customer, int price, int moneyPaid) {
		System.out.println("\n--- [" + this.storeName + "] 에서 판매 시작 (" + customer.grade + ") ---");
		// [할인 적용]
		int discountPrice = price;
		double discountRate = 0;
		
		if (customer.grade.equals("VVIP")) {
			discountRate = 0.1; // 10%
		} else if (customer.grade.equals("VIP")) {
			discountRate = 0.03; // 3%
		}
		
		int discountAmount = (int)(price * discountRate);
		discountPrice = price - discountAmount;
		
		if (discountAmount > 0) {
			System.out.println("등급 할인 적용(-" + discountAmount + "원)");
		}
		// [포인트 사용] 10000점 초과 시 사용 가능 (부분 사용 가능하도록 구현)
		int usePoint = 0;
		if (customer.point > 10000) {
			// 예시: 결제 금액만큼만 포인트 사용 (혹은 사용자 입력값이 없으므로 합리적 최대치 사용)
			if (customer.point >= discountPrice) {
				usePoint = discountPrice;
			} else {
				usePoint = customer.point;
			}
			customer.point -= usePoint;
			System.out.println("포인트 사용: " + usePoint + "점");
		}
		
		// 실 결제 금액
		int finalPrice = discountPrice - usePoint;
		
		// 지불 확인
		if (moneyPaid < finalPrice) {
			System.out.println("지불 금액이 부족합니다.");
			return moneyPaid;
		}
		
		// 계산 및 차감
		int change = moneyPaid - finalPrice;
		customer.money -= finalPrice;
		
		System.out.println("최종 결제액: " + finalPrice + "원");
		System.out.println("거스름돈: " + change + "원");
		// [포인트 적립] 등급별 차등 지급
		int earnedPoint = 0;
		if (customer.grade.equals("VVIP")) {
			earnedPoint = (int)(price * 0.03); // VVIP 3%
			System.out.println("VVIP 적립(3%): " + earnedPoint + "점");
		} else if (customer.grade.equals("VIP")) {
			earnedPoint = 0; // VIP 적립 없음
			System.out.println("VIP 적립: 0점 (혜택 없음)");
		} else {
			earnedPoint = (int)(price * 0.005); // 일반 0.5% (백화점 기본)
			System.out.println("일반 적립(0.5%): " + earnedPoint + "점");
		}
		
		customer.point += earnedPoint;
		return change;
	}
}