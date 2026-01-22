package oop;

public class Seller {
	
	int productPrice = 1000;
	int products;
	int wallet;
	
	public Seller(int products) {
		this.products = products;
	}
	
	public void sell(int num) {
		if(products <= num) {
			num = products;
			products = 0;
			wallet += num * productPrice;
		}else {
			products -= num;
			wallet += num * productPrice;
		}
		if(products == 0) System.out.println("품절되었습니다.");
	}
}
