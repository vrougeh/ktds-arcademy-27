package com.ktdsuniversit.edu.restaurant;



/**
 * 메뉴
 * 레스토랑명 메뉴 이름 가격 포만감 알코올도수
 */
public class Menu {
	//Restaurant restaurant;
    String name;
    int price;
    int full;
    double alchole;
    int menuCount;

    public Menu(/*Restaurant restaurant ,*/String name,int price,double alchole,int count){
    	/*this.restaurant = restaurant;*/
    	this.name=name;
        this.price=price;
        this.alchole=alchole;
        this.menuCount = count;
    }
    public Menu(/*Restaurant restaurant ,*/String name,int price,int full,int count){
    	this.name=name;
        this.price=price;
    	this.full=full;
        this.menuCount = count;
    }
    
    public int getPrice(){
    	return this.price;
    }

    public int getFull(){
        return this.full;
    }
    public double getAlchole(){
        return this.alchole;
    }
    public String getName(){
        return this.name;
    }
    
    public int getMenuCount() {
    	return this.menuCount;
    }
    public void setMenuCount(int count) {
    	this.menuCount -= count;
    }

}