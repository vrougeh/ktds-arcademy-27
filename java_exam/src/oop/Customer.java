package oop;

public class Customer {
	
	int productPrice = 1000;
	int products;
	int wallet;
	int productWeight = 500;
	int shoppingCartWeight;
	int maxProductWeight;
	
	
	public Customer(int maxProductWeight , int wallet) {
		this.maxProductWeight = maxProductWeight;
		this.wallet = wallet;
	}
	
	public void buy(int num) {
		if(maxProductWeight <= setShoppingCartWeight(num)) {
			System.out.println("더이상 장바구니를 들 수 없습니다.");
		}else if(wallet < productPrice * num) {
			System.out.println("돈이 부족합니다.");
		}else {
			setShoppingCartWeight(num);
			products += num;
			wallet -= productPrice*num;
		}
	}
	
	public int setShoppingCartWeight(int num) {
		
		return	shoppingCartWeight += productWeight * num;
	}

}
