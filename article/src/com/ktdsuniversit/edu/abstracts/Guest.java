package com.ktdsuniversit.edu.abstracts;

public class Guest {

	private int money;
	private int point;
	
	
	
	public Guest(int money, int point) {
		this.money = money;
		this.point = point;
	}
	
	public int getPoint() {
		return this.point;
	}
	
	public void usePoint(int point) {
		this.point -= point;
	}
	
	public void addPoint(int point) {
		this.point += point;
	}
	
	
	public void pay(int amount) {
		this.money -= amount;
	}
	public void giveMoney(int remainMoney) {
		this.money += remainMoney;
	}
	
	@Override
	public String toString() {
		return "고객에게 남은 돈 : " + this.money + "  고객에게 남은 포인트 : " + this.point;
		
	}
	
}
