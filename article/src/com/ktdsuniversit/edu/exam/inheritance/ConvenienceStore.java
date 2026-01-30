package com.ktdsuniversit.edu.exam.inheritance;

public class ConvenienceStore extends Mart {

	public ConvenienceStore(String storeName) {
		super(storeName);
	}

	@Override
	public int sell(Customer customer, int price, int moneyPaid) {
		System.out.println("\n--- [" + this.storeName + "] 에서 판매 시작 ---");
		
		// [포인트 사용] 100점 초과 시 강제 전액 사용
		int usePoint = 0;
		if (customer.point > 100) {
			if (customer.point >= price) {
				// 포인트가 가격보다 많아도 "전액 사용" 조건에 따라 보유 포인트 0으로 만듦
				usePoint = customer.point; 
			} else {
				usePoint = customer.point;
			}
			customer.point = 0; // 전액 소진
			System.out.println("포인트 전액 사용: " + usePoint + "점");
		}
		
		// 실 결제 금액 계산
		int finalPrice = price - usePoint;
		if (finalPrice < 0) {
			finalPrice = 0;
		}
		
		// 지불 확인
		if (moneyPaid < finalPrice) {
			System.out.println("지불 금액이 부족합니다.");
			return moneyPaid;
		}
		
		// 계산 및 차감
		int change = moneyPaid - finalPrice;
		customer.money -= finalPrice;
		
		System.out.println("상품 가격: " + price + "원");
		System.out.println("실 결제액: " + finalPrice + "원");
		System.out.println("거스름돈: " + change + "원");
		
		// [포인트 적립] 판매 금액의 0.1%
		int earnedPoint = (int)(price * 0.001);
		customer.point += earnedPoint;
		System.out.println("적립 포인트(0.1%): " + earnedPoint + "점");
		
		return change;
	}
}