package oop;

public class CustomerTest {
	
	public static void main(String[] args) {
		Customer customer = new Customer(5000,10000);
		
		customer.buy(4);
		customer.buy(4);
		
		System.out.println("상품 수 : " + customer.products);
		System.out.println("장바구니의 무게 : " + customer.shoppingCartWeight);
		System.out.println("지갑의 돈 : " + customer.wallet);
	}
}
