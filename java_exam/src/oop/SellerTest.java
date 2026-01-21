package oop;

public class SellerTest {

	public static void main(String[] args) {
		Seller sell = new Seller();
		
		sell.products = 15;
		
		sell.sell(6);
		System.out.println("재고 수 : "+sell.products);
		System.out.println("자본금 : "+sell.wallet);
		

	}

}
