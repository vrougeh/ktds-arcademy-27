package com.ktdsuniversity.edu.abstracts;


/**
 * public class nmae = 인스턴스 생성 가능한 일반클래스 정의 
 * public abstract class name = 인스턴스 생성 불가 추상클래스 정의
 */

public abstract class AbstractMart {
	
	//금고(받은돈의 총액)
	private int safe;
	//상품가격
	private int productPrice;
	//고객에게 거슬러줄 돈
	private int remainMoney;
	
	public AbstractMart(int productPrice) {
		this.productPrice = productPrice;
	}
	
	public void sell(Guest guest, int sellCount, int money) {
		this.remainMoney =money;
		
		int guestPoint = this.usePoint(guest);
		
		
		//판매가격
		int amount = sellCount * this.productPrice;
		
		amount -= this.discount(guest, amount);
		
		if(money+guestPoint < amount) {
			System.out.println("돈이 모자랍니다. 구매가격 : " + amount + ", 손님이 낸 돈 : " + money);
			return;
		}
		
		
		//손님잉 마트에 돈을 지불한다
		guest.pay(money);

		this.givePoint(guest, amount);
		
		
		if(amount > guestPoint) {
			this.remainMoney -= amount - guestPoint;
		}

		this.safe += money - this.remainMoney;
		
		
		
		System.out.println("매출액 : " + this.safe);
		System.out.println("거슬러 줄 돈 : " + this.remainMoney);
		
		
		guest.giveMoney(this.remainMoney);
		this.remainMoney = 0;
		
		
	}
	
	//사상 데이터 각각의 마트에서 사용방법이 다름. 해당 마트에서 어떻게 동작할지 모르니 선언만 해두고 실사용하는 곳에서 구현 - 공통으로 사용하지만 내부 사용이 다를경우 사용
	
	public abstract int usePoint(Guest guest);
	
	public abstract void givePoint(Guest guest, int amount);
	
	public abstract int discount(Guest guest, int amount);

}
