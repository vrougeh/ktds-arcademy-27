package oop_exam;


/**
 * <pre>
 * 손님을 정의한다
 * 손님의 이름 손님의배부름정도 손님의취함정도 손님의 소지금
 * 
 * 손님이 주문(order)을 하면 레스토랑과 메류를 받는다
 * 해당 메뉴가 레스토랑에 있는지 확인후 있다면 연산한다.
 * 배부름 설정 - 못먹을정도인지확인
 * 취함 설정 - 못먹을정도인지확인
 * 소지금설정 - 금액 괜찮은지 확인
 * </pre>
 */
public class Customer {
    String name;
    int full;
    double alchole;
    int money;
    
    boolean isFull;
    boolean isAlchole;
    boolean isMoney;


    public Customer(String name, int full, double alchole, int money) {
        this.name = name;
        this.full = full;
        this.alchole = alchole;
        this.money = money;
    }
    
    public String getName() {
    	return name;
    }

    public int getFull() {
        return full;
    }
    public void setFull(int restaurantFull ,int menuFull) {
    	int nowFull = getFull() + menuFull;
    	if(nowFull > restaurantFull) {
    		this.isFull =true;
    	}else {
    		this.full += menuFull;
    		this.isFull = false;
    	}
    }

    public double getAlchole() {
        return alchole;
    }
    public void setAlchole(double restaurantAlchole,double menuAlchole) {
    	double nowAlchole = getAlchole() + menuAlchole;
    	if(nowAlchole > restaurantAlchole) {
    		this.isAlchole = true;
    	}else {
    		this.alchole += menuAlchole;
    		this.isAlchole = false;
    	}
    }

    public int getMoney() {
        return money;
    }
    public void setMoney(Restaurant restaurant, int menuMoney) {
    	int nowMoney = getMoney() - menuMoney;
    	if(nowMoney <= 0) {
    		isMoney = true;
    	}else {
    		isMoney = false;
    		this.money -= menuMoney;
    		restaurant.restorentMoney += menuMoney;
    	}
    }

    public void order(Restaurant restaurant,Menu menu) {
    	
    	setFull(restaurant.getFull() ,menu.getFull());
    	setAlchole(restaurant.getAlchole(),menu.getAlchole());
    	setMoney(restaurant,menu.getPrice());
    	
    	System.out.println("고객명 : " + getName());
    	System.out.println(getName() + "의 취함 정도 : " + getAlchole());
    	System.out.println(getName() + "의 배부름 정도 : " + getFull());
    	System.out.println(getName() + "의 소지금 : " + getMoney());
    	System.out.println("주문금액: " + menu.getPrice());
    	System.out.println("식당의 배부름 기준 " + restaurant.getFull());
    	
    	
    	
    	if(this.isFull) {
    		System.out.println("주문 실패 - 너무 배부름");    		
    	}else if(this.isAlchole) {
    		System.out.println("주문 실패 - 너무 취함");    		
    	}else if(this.isMoney) {
    		System.out.println(this.name + "의 소지금 부족");    		
    	}else {
    		menu.menuCount -= 1;
    		System.out.println("주문성공");    		
    	}
    	System.out.println();
    }

}