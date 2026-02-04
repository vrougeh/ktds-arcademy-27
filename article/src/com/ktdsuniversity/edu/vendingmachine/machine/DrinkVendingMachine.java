package com.ktdsuniversity.edu.vendingmachine.machine;

import com.ktdsuniversity.edu.vendingmachine.item.Drinks;

public class DrinkVendingMachine {
	
	int refundMoney;
	public int getRefundMoney() {
		return this.refundMoney;
	}
	
	public void setRefundMoney(int refundMoney) {
		this.refundMoney = refundMoney;
	}
	
	
	Drinks[] drink;
	
	
	public DrinkVendingMachine(Drinks bks, Drinks mst, Drinks hss, Drinks mks) {
		this.drink = new Drinks[4];
		this.drink[0] = bks;
		this.drink[1] = mst;
		this.drink[2] = hss;
		this.drink[3] = mks;
	}
	
	
	/*
	 * 주문하면 가격을 반환한다
	 * 주문수량만큼 재고가 감소된다
	 * 재고가 없다면 상품이 품절되었습니다 출력하고 0을 반환한다
	 */
	//주문하기(제품번호,주문수량,넣은돈)	:int
	public int order(int num, int count, int money) {
		this.refundMoney = 0;
		
		if (num < this.drink.length) {
			int stock = this.drink[num].getCount();
			if(stock <= 0) {
				System.out.println("상품이 품절되었습니다.");
				return 0;
			}else if(stock < count) {
				count = stock;
				stock = 0;
			}
			int price = this.drink[num].getPrice() * count;
			
			if(money >= price) {
				this.drink[num].setCount(this.drink[num].getCount() - count);
				this.refundMoney = money-price;
//				System.out.println(money-price + "원이 환불되었습니다.");
				return price;
			}else {
				System.out.println("돈이 모자릅니다.");
				return 0;
			}
			
		}
		System.out.println("error");
		return 0;
	}
	
	
	//입고하기(제품번호,입고수량)	:void
	public void input(int num, int count) {
		if (num < this.drink.length) {			
			this.drink[num].setCount(this.drink[num].getCount() + count);
		}
		
	}
	
	//상품재고출력()			:void
	public void countDrinks() {
		for(int i = 0 ; i < this.drink.length ; i++) {
			System.out.print(this.drink[i].getName() +" "+ this.drink[i].getCount() + "개 남았습니다."+ "\t");
		}
		System.out.println();
	}
}
