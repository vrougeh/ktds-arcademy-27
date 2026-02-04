package com.ktdsuniversity.edu.restaurant;

import com.ktdsuniversity.edu.restaurant.exceptions.*;

/**
 * <pre>
 * 손님을 정의한다
 * 손님의 이름 손님의배부름정도 손님의취함정도 손님의 소지금
 * 
 * 손님이 주문(order)을 하면 레스토랑과 메류를 받는다
 * 해당 메뉴가 레스토랑에 있는지 확인후 있다면 연산한다.
 * 배부름 설정 - 못먹을정도인지확인
 * 취함 설정 - 못먹을정도인지확인
 * 소지금설정 - 금액 괜찮은지 확인
 * </pre>
 */
public class Customer {
	String name;
	int full;
	double alchole;
	int money;
	
	public Customer(String name, int full, double alchole, int money) {
		this.name = name;
		this.full = full;
		this.alchole = alchole;
		this.money = money;
	}
	
	public String getName() {
		return this.name;
	}
	public int getFull() {
		return this.full;
	}
	public double getAlchole() {
		return this.alchole;
	}
	public int getMoney() {
		return this.money;
	}
	
	/**
	 * 주문 로직
	 */
	public void order(Restaurant restaurant, Menu menu) 
			throws FullException, DrunkenException, InsufficientBalanceException, SoldOutException {
		
		// 1. 유효성 검사
		if (restaurant == null || menu == null) {
			throw new NullPointerException("식당 혹은 메뉴가 존재하지 않습니다.");
		}
	
		// 2. 메뉴판에 있는 메뉴인지 확인
		boolean isEqual = false;
		for (Menu m : restaurant.getMenu()) {
			if (m != null && m.getName().equals(menu.getName())) {
				isEqual = true;
				break;
			}
		}
		if (!isEqual) {
			throw new IllegalArgumentException("해당 식당에 없는 메뉴입니다."); 
		}
	
		// 3. 상황별 예외 체크
		menu.decreaseStock(); // 재고 부족 (SoldOutException)
		
		if (this.full + menu.getFull() > restaurant.getFull()) {
		    throw new FullException("배가 너무 부릅니다.");
		}
		
		if (this.alchole + menu.getAlchole() > restaurant.getAlchole()) {
		    throw new DrunkenException("너무 취했습니다.");
		}
		
		if (this.money < menu.getPrice()) {
		    throw new InsufficientBalanceException("잔액이 부족합니다.");
		}
		
		// 4. 모든 예외를 통과했으므로 정상 처리
		this.full += menu.getFull();
		this.alchole += menu.getAlchole();
		this.money -= menu.getPrice();
		restaurant.setMoney(menu.getPrice());
		
		System.out.println("고객명 : " + this.name);
		System.out.println(this.name + "의 취함 정도 : " + this.alchole);
		System.out.println(this.name + "의 배부름 정도 : " + this.full);
		System.out.println(this.name + "의 소지금 : " + this.money);
		System.out.println("주문금액: " + menu.getPrice());
		System.out.println("식당의 취함 기준 " + restaurant.getAlchole());
		System.out.println("식당의 배부름 기준 " + restaurant.getFull());
		System.out.println(">> 주문 성공");
	}
}