package com.ktdsuniversity.edu.datetime.mart;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Store {
	
	private List<Item> items;
	
	public Store() {
		this.items = new ArrayList<>();
	}
	
	public void add(Item item) {
		//추가
		if (item != null) {
			this.items.add(item);
		} else {
			System.out.println("추가하려는 상품 정보가 올바르지 않습니다.");
		}
	}
	
	public void sell(int index) {
		
		/*
		 * index에 할당되어있는 제품의 소비기한이 당일이라면
		 * "오늘까지 드세요"를 출력
		 * 
		 * 소비기한이 3일 내에 도래한다면
		 * "가능한 빨리 드세요" 를 추력
		 * 
		 * 소비기한이 지났다면
		 * "소비기한이 지나 판매하지 않습니다"를 출력
		 * 
		 */
		// 인덱스 유효성 검사
		if (index < 0 || index >= this.items.size()) {
			System.out.println("해당 상품이 존재하지 않습니다.");
			return;
		}
		
		Item item = this.items.get(index);
		LocalDate today = LocalDate.now();
		LocalDate expireDate = item.getExpireDate();
		
		// 소비기한과 오늘 날짜 비교
		if (expireDate.isBefore(today)) {
			System.out.println(item.getName() + ": 소비기한이 지나 판매하지 않습니다.");
		} else if (expireDate.isEqual(today)) {
			System.out.println(item.getName() + ": 오늘까지 드세요.");
		} else {
			// 오늘과 소비기한 사이의 일수 차이 계산
			long daysBetween = ChronoUnit.DAYS.between(today, expireDate);
			if (daysBetween <= 3) {
				System.out.println(item.getName() + ": 가능한 빨리 드세요.");
			} else {
				System.out.println(item.getName() + ": 판매 가능 (남은 기한: " + daysBetween + "일)");
			}
		}
		
	}
}
