package com.ktdsuniversit.edu.exam.inheritance;

/*
판매점 클래스를 작성

판매점은 규모에 따라 일반마트, 편의점, 백화점으로 구분됩니다.
 
일반마트, 편의점, 백화점을 상속과 IS-A 관계를 이용해 아래 예시로 구현합니다.
 
1. 일반마트는 진열한 상품을 판매만 합니다.
판매는 구매자로부터 돈을 받고 판매하고 남은 거스름돈을 구매자에게 돌려줍니다.
 
2. 편의점은 진열한 상품을 판매하고 구매자에게 판매금액의 0.1%의 포인트를 지급합니다.
판매는 구매자로부터 돈을 받고 판매하고 남은 거스름돈을 구매자에게 돌려줍니다.
동시에, 구매자에게 구매금액의 0.1% 만큼의 포인트를 지급합니다.
구매자의 포인트가 100점이 넘어갈 경우, 현금처럼 사용할 수 있습니다.
단, 포인트는 전액 사용해야 합니다. (상품 금액이 포인트보다 작을 때에도 전액 사용해야합니다.)
예를 들어, 구매자에게 2000의 포인트가 있고 5000원 상당의 상품을 구매할 때, 구매자는 3000원만 지불합니다. 그리고 구매자는 5000원의 0.1%만큼의 포인트를 지급받습니다.
또 다른 구매자에게는 3000의 포인트가 있고 7000원 상당의 상품을 구매할 때, 15000원을 지불하면 판매자는 15000 - (7000-3000)만큼을 거슬러 줍니다. 그리고 구매자는 7000원의 0.1%만큼의 포인트를 지급받습니다.
 
3. 백화점은 진열한 상품을 판매하고 구매자에게 판매금액의 0.5%의 포인트를 지급합니다.
또 고객의 등급에 따라 차등 할인 혜택을 제공합니다.
고객의 등급이 일반등급일 경우 할인 혜택은 제공받지 못하지만 포인트를 지급받습니다.
고객의 등급이 VIP등급일 경우 3% 할인 혜택을 제공받습니다. 하지만, 포인트를 지급받지 못합니다.
고객의 등급이 VVIP인 경우 10% 할인 혜택을 제공받고 3%의 포인트를 지급 받습니다.
고객의 포인트가 10000점이 넘어갈 경우, 현금처럼 사용할 수 있습니다. - 포인트는 전액을 사용하거나 일부만 사용할 수도 있습니다.
 * 
 */
//규모를 기준으로 일반마트 - 편의점 - 백화점으로 구분
//일반마트 - 거스름돈 기능
//편의점 extends 일반바트 - 상품금액의 0.1% 포인트지급기능, 100포인트 넘으면 전액사용(상품금액이 포인트보다 작아도)
//백화점 extends 편의점  - 포인트지급 기능 가져와서 조건에 맞게 수정

public class Store {
	
	//0 : 일반마트 1 : 편의점 3 : 백화점
	private int store;
	private int money;
	private int money2;

	public Store(int store, int money, int money2) {
		this.store = store;
		this.money = money;
		this.money2 = money2;
	}
	

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getMoney2() {
		return money2;
	}

	public void setMoney2(int money2) {
		this.money2 = money2;
	}

	public int getStore() {
		return store;
	}

	public void setStore(int store) {
		this.store = store;
	}
	
	public int order() {
		return money - money2;
	}

}
