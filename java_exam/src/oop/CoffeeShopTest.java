package oop;

public class CoffeeShopTest {
	
	public static void main(String[] args) {
		
		Coffee hotCoffee = new Coffee("아메리카노",4500);
		Coffee iceCoffee = new Coffee("아이스티",4000);
		Coffee tea = new Coffee("녹차",5000);
		
		
		CoffeeShopArray starbArr = new CoffeeShopArray(iceCoffee, hotCoffee,tea);
		
		CoffeeShop starb = new CoffeeShop(iceCoffee, hotCoffee);
		CoffeeShop starb1 = new CoffeeShop();

		int price = starbArr.orderCoffee(1,3);
		System.out.println(price+"원");
		
		price = starbArr.orderCoffee(2, 6);
		System.out.println(price+"원");
		
		price = starbArr.orderCoffee(0, 4);
		System.out.println(price+"원");
		
		price = starbArr.orderCoffee(3, 4);
		System.out.println(price+"원");
		
		price = starb.orderCoffee(1);
		System.out.println(price+"원");
		
		price = starb.orderCoffee(2);
		System.out.println(price+"원");
		
		price = starb1.orderCoffee(1);
		System.out.println(price+"원");
		
		price = starb1.orderCoffee(1,4);
		System.out.println(price+"원");
		
		price = starb1.orderCoffee(2);
		System.out.println(price+"원");
		
		
		
		price = starb1.orderCoffee2(Item.HOT, 3);
		System.out.println(price+"원");
		price = starb1.orderCoffee2(Item.ICE, 2);
		System.out.println(price+"원");
	}

}
