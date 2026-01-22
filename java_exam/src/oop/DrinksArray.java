package oop;

public class DrinksArray {
	Drinks[] drink;
	
	
	public DrinksArray(Drinks bks, Drinks mst, Drinks hss, Drinks mks) {
		this.drink = new Drinks[4];
		this.drink[0] = bks;
		this.drink[1] = mst;
		this.drink[2] = hss;
		this.drink[3] = mks;
	}
	
	
	/*
	 * 주문하면 가격을 반환한다
	 * 주문수량만큼 재고가 감소된다
	 * 재고가 없다면 상품이 품절되었습니다 출력하고 0을 반환한다
	 */
	//주문하기(제품번호,주문수량)	:int
	public int order(int num, int count) {
		if (num < this.drink.length) {
			int stock = this.drink[num].count;
			if(stock <= 0) {
				System.out.println("상품이 품절되었습니다.");
				return 0;
			}else if(stock < count) {
				count = stock;
				stock = 0;
			}
			int price = this.drink[num].price * count;
			this.drink[num].count -= count;
			return price;
		}
		System.out.println("error");
		return 0;
	}
	
	
	//입고하기(제품번호,입고수량)	:void
	public void input(int num, int count) {
		if (num < this.drink.length) {			
			this.drink[num].count += count;
		}
		
	}
	
	//상품재고출력()			:void
	public void countDrinks() {
		for(int i = 0 ; i < this.drink.length ; i++) {
			System.out.print(this.drink[i].name +" "+ this.drink[i].count + "개 남았습니다."+ "\t");
		}
		System.out.println();
	}

}
