package com.ktdsuniversity.edu.datetime.mart;

import java.time.LocalDate;

public class StoreTest {
	
	public static void main(String[] args) {
		
		Store mart = new Store();
		
		// 1. 소비기한 지난 상품 (어제)
		mart.add(new Item("상한 우유", LocalDate.now().minusDays(1)));
		
		// 2. 오늘까지인 상품
		mart.add(new Item("오늘 마감 샌드위치", LocalDate.now()));
		
		// 3. 3일 내에 도래하는 상품 (모레)
		mart.add(new Item("신선한 요플레", LocalDate.now().plusDays(2)));
		
		// 4. 여유 있는 상품 (일주일 뒤)
		mart.add(new Item("통조림", LocalDate.now().plusMonths(14)));
		
		System.out.println("--- 판매 시작 ---");
		mart.sell(0); // 상한 우유
		mart.sell(1); // 오늘 마감 샌드위치
		mart.sell(2); // 신선한 요플레
		mart.sell(3); // 통조림
		
	}
}
