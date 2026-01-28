package com.ktdsuniversit.edu.exam.inheritance;

public class StoreTest {
	public static void main(String[] args) {
		//손님이 판매점에 들어와서 마트를 골라 들어가서 상품을 구매한다.
		// 1. 마트 고르기
		// 2. 구매할 상품금액, 소지한 금액 입력
		// 3. 포인트 조회 및 사용
		// 4. 리턴값
		
		//0 : 일반마트 1 : 편의점 3 : 백화점
		
		Store store0 = new Store(0, 0, 0);
		
		
		store0.order();
		
	}

}
