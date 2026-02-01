package com.ktdsuniversit.edu.restaurant;

import com.ktdsuniversit.edu.restaurant.exceptions.*;

/**
 * 메뉴
 * 레스토랑명 메뉴 이름 가격 포만감 알코올도수
 */
public class Menu {
	//Restaurant restaurant;
	String name;
	int price;
	int full;
	double alchole;
	int menuCount;
	
	public Menu(/*Restaurant restaurant ,*/String name,int price,double alchole,int count){
		/*this.restaurant = restaurant;*/
		this.name=name;
		this.price=price;
		this.alchole=alchole;
		this.menuCount = count;
	}
	public Menu(/*Restaurant restaurant ,*/String name,int price,int full,int count){
		this.name=name;
		this.price=price;
		this.full=full;
		this.menuCount = count;
	}
	
	// [수정] 재고 감소 로직: 재고가 없으면 예외 발생
	public void decreaseStock() throws SoldOutException {
		if (this.menuCount <= 0) {
			throw new SoldOutException(this.name + "은(는) 품절되었습니다.");
		}
		this.menuCount--;
	}
	
	public int getPrice(){
		return this.price;
	}
	
	public int getFull(){
		return this.full;
	}
	public double getAlchole(){
		return this.alchole;
	}
	public String getName(){
		return this.name;
	}
	
	public int getMenuCount() {
		return this.menuCount;
	}
}