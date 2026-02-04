package com.ktdsuniversity.edu.inheritance.vendingmachine;

import com.ktdsuniversity.edu.vendingmachine.item.Drinks;
import com.ktdsuniversity.edu.vendingmachine.machine.DrinkVendingMachine;

public class RefundableDrinkVendingMachineTest {
	public static void main(String[] args) {
		
//		주문시 기계에 넣는 돈 추가
//		얼마 환불되는지 연산되어 출력

		Drinks bks = new Drinks("박카스",900,15);
		Drinks mst = new Drinks("몬스터",1500,200);
		Drinks hss = new Drinks("핫식스",1300,10);
		Drinks mks = new Drinks("밀키스",1400,5);
		
		DrinkVendingMachine drinkVendingMachine = new RefundableDrinkVendingMachine(bks, mst, hss, mks);
		
		drinkVendingMachine.countDrinks();
		int price = drinkVendingMachine.order(0, 10, 10000);
		System.out.println("주문금액 : " + price);
		if(drinkVendingMachine instanceof RefundableDrinkVendingMachine rfMachine) {
			rfMachine.refund();
		}
		

		drinkVendingMachine.countDrinks();
		int price1 = drinkVendingMachine.order(1, 20,50000);
		System.out.println("주문금액 : " + price1);
		if(drinkVendingMachine instanceof RefundableDrinkVendingMachine rfMachine) {
			rfMachine.refund();
		}
		
		drinkVendingMachine.countDrinks();
		int price2 = drinkVendingMachine.order(1, 10,30000);
		System.out.println("주문금액 : " + price2);
		if(drinkVendingMachine instanceof RefundableDrinkVendingMachine rfMachine) {
			rfMachine.refund();
		}
		
		
		drinkVendingMachine.countDrinks();
		int price3 = drinkVendingMachine.order(2, 8,50000);
		System.out.println("주문금액 : " + price3);
		if(drinkVendingMachine instanceof RefundableDrinkVendingMachine rfMachine) {
			rfMachine.refund();
		}
		
		
		drinkVendingMachine.countDrinks();
		price = drinkVendingMachine.order(5, 8, 10000);
		System.out.println("주문금액 : " + price);
		if(drinkVendingMachine instanceof RefundableDrinkVendingMachine rfMachine) {
			rfMachine.refund();
		}
		
		
//		출력
//		주문금액 : 0000원
//		0000원 환불되었습니다.
		
		
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
