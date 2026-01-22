package oop;

public class CoffeeShopTest {
	
	public static void main(String[] args) {
		
		Coffee hotCoffee = new Coffee("아메리카노",4500);
		Coffee iceCoffee = new Coffee("아이스티",4000);
		Coffee tea = new Coffee("녹차",5000);
		
		
		CoffeeShopArray starb = new CoffeeShopArray(iceCoffee, hotCoffee,tea);
		
		int price = starb.orderCoffee(1,3);
		System.out.println(price+"원");
		
		price = starb.orderCoffee(2, 6);
		System.out.println(price+"원");
		
		price = starb.orderCoffee(0, 4);
		System.out.println(price+"원");

	
		price = starb.orderCoffee(3, 4);
		System.out.println(price+"원");
	}

}
