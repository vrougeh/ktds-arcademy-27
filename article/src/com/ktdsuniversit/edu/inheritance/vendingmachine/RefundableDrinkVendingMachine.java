package com.ktdsuniversit.edu.inheritance.vendingmachine;

import com.ktdsuniversit.edu.vendingmachine.item.Drinks;
import com.ktdsuniversit.edu.vendingmachine.machine.DrinkVendingMachine;


//DrinkVendingMachine 을 상속하여 환불하는 기능을 추가하여라
public class RefundableDrinkVendingMachine extends DrinkVendingMachine{

	public RefundableDrinkVendingMachine(Drinks bks, Drinks mst, Drinks hss, Drinks mks) {
		super(bks, mst, hss, mks);
	}
	
	public void refund() {
		System.out.println(super.getRefundMoney()+ "원 환불되었습니다.");;
	}

}
