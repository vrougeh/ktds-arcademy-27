package com.ktdsuniversity.edu.datetime.mart;

import java.time.LocalDate;

public class Item {
	
	private String name;
	private LocalDate expireDate;
	
	//생성자
	public Item(String name , LocalDate expirDate) {
		this.name = name;
		this.expireDate = expirDate;
	}
	
	
	//getter setter
	public String getName() {
		return this.name;
	}
	
	
	public LocalDate getExpireDate() {
		return this.expireDate;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Item [name=" + name + ", expireDate=" + expireDate + "]";
	}
	
	
	

}
