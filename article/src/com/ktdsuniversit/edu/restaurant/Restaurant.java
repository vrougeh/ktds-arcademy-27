package com.ktdsuniversit.edu.restaurant;

/**
 * 레스토랑을 정의한다	
 * 이름 레스토랑배부름제한 레스토랑취함제한 매출금
 */
public class Restaurant {
    String name;
    int restorentFull;
    double restorentAlchole;
    int restorentMoney;
    protected Menu[] menu;

    public Restaurant(String name, int restorentFull, double restorentAlchole, int restorentMoney, Menu[] menu) {
        this.name = name;
        this.restorentFull = restorentFull;
        this.restorentAlchole = restorentAlchole;
        this.restorentMoney = restorentMoney;
        this.menu = menu;
    }

    public int getFull() {
        return this.restorentFull;
    }
    public double getAlchole() {
        return this.restorentAlchole;
    }
    public int getMoney() {
        return this.restorentMoney;
    }
    public void setMoney(int menuMoney) {
    	this.restorentMoney += menuMoney;
    }
    public String getName() {
        return this.name;
    }
    public Menu[] getMenu() {
    	return this.menu;
    }
    
    
    public void printInformation() {
    	System.out.println(getName()+"상태 확인");
    	System.out.println("Menu ========");
    	for(int i = 0; i < this.menu.length ; i++) {
    		if(this.menu[i].getFull() == 0) {
    			System.out.println(i+1+ ". " + this.menu[i].getName() + " / " + this.menu[i].getPrice() + "원 / " + this.menu[i].getAlchole() + "% / " + this.menu[i].getMenuCount() + "개");    		
    		}else {
    			System.out.println(i+1+ ". " + this.menu[i].getName() + " / " + this.menu[i].getPrice() + "원 / " + this.menu[i].getFull() + "g / " + this.menu[i].getMenuCount()+ "개");    		
    		}
    	}
    	System.out.println("매출금 : " + this.restorentMoney);
    }

/*
 * 출력예시
 * 
 * VIPS상태 확인
Menu ========
1. 주류 / 5000원 / 19.0% / 98개
2. 주류 / 6000원 / 6.0% / 78개
3. 주류 / 5000원 / 40.0% / 12개
4. 식사류 / 10000원 / 500g / 200개
5. 식사류 / 8000원 / 300g / 69개
매출금: 45000
 */
}