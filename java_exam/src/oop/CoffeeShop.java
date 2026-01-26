package oop;

public class CoffeeShop {
	Coffee ice;
	Coffee hot;
	
	public CoffeeShop(Coffee ice, Coffee hot) {
		this.ice = ice;
		this.hot = hot;
	}
	
	public CoffeeShop() {
		//this.hot = new Coffee("기본 아메리카노",1500,30);
		//this.ice = new Coffee("아이스 아메리카노",1500,50);
		
		this(new Coffee("아이스 아메리카노",1500,50)
			,new Coffee("기본 아메리카노",1500,30));
	}
	
	
	/**
	 * 커피숍에서 커피 판매
	 * @param menu 메뉴들의 번호 1:hot, 2:ice
	 * @param quantity 주문수량
	 * @return 주문 가격
	 */
	public int orderCoffee(int menu, int quantity) {
		if(menu == 1) {
			System.out.println(this.hot.name + " 음료를 "+ quantity +"개 주문 받았습니다.");
			return this.hot.price * quantity;	
		}else if(menu == 2) {
			System.out.println(this.ice.name + " 음료를 "+ quantity +"개 주문 받았습니다.");
			return this.ice.price * quantity;
		}else {
			System.out.println("존재하지 않는 가격입니다.");
			return 0;
		}
	}
	
	public int orderCoffee(int menu){
		int price = this.orderCoffee(menu,1);
		return price;
	}
	
	/**
	 * 가장 첫번째 메뉴를 한개 주문한다
	 * @return
	 */
	public int orderCoffee() {
		int price = this.orderCoffee(1);
		return price;
		
	}
	
	
}
