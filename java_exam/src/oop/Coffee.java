package oop;


/**
 * 커피 메뉴를 나타내는 클래스
 */
public class Coffee {
	String name;
	int price;
	int count;
	
	public Coffee(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Coffee(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
}