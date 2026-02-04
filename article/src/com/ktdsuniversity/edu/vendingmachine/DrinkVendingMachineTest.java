package com.ktdsuniversity.edu.vendingmachine;

import com.ktdsuniversity.edu.vendingmachine.item.Drinks;
import com.ktdsuniversity.edu.vendingmachine.machine.DrinkVendingMachine;

public class DrinkVendingMachineTest {
	public static void main(String[] args) {
		
		Drinks bks = new Drinks("박카스",900,15);
		Drinks mst = new Drinks("몬스터",1500,20);
		Drinks hss = new Drinks("핫식스",1300,10);
		Drinks mks = new Drinks("밀키스",1400,5);
		
		DrinkVendingMachine drinkVendingMachine = new DrinkVendingMachine(bks, mst, hss, mks);
		
		drinkVendingMachine.countDrinks();
		int price = drinkVendingMachine.order(0, 10,0);
		System.out.println(price+"원");

		drinkVendingMachine.countDrinks();
		price = drinkVendingMachine.order(1, 20,0);
		System.out.println(price+"원");
		
		drinkVendingMachine.countDrinks();
		price = drinkVendingMachine.order(1, 10,0);
		System.out.println(price+"원");
		
		drinkVendingMachine.countDrinks();
		price = drinkVendingMachine.order(2, 8,0);
		System.out.println(price+"원");
				
		drinkVendingMachine.countDrinks();
		price = drinkVendingMachine.order(5, 8,0);
		System.out.println(price+"원");

		
		
		drinkVendingMachine.countDrinks();
		drinkVendingMachine.input(0, 7);
		drinkVendingMachine.countDrinks();
		drinkVendingMachine.input(1, 87);
		drinkVendingMachine.countDrinks();
		drinkVendingMachine.input(2, 4);
		drinkVendingMachine.countDrinks();
		drinkVendingMachine.input(3, 50);
		drinkVendingMachine.countDrinks();
		drinkVendingMachine.input(4, 7);
		drinkVendingMachine.countDrinks();
	
	}

}
