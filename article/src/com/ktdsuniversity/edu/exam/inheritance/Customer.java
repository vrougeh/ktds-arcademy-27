package com.ktdsuniversity.edu.exam.inheritance;

//1. 구매자 클래스
public class Customer {
	String name;
	int money;
	int point;
	String grade; // 일반, VIP, VVIP
	
	public Customer(String name, int money, int point, String grade) {
		this.name = name;
		this.money = money;
		this.point = point;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return String.format("%s님 (돈: %d원, 포인트: %d점, 등급: %s)", name, money, point, grade);
	}
}