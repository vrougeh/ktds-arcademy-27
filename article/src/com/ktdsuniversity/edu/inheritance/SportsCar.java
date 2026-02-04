package com.ktdsuniversity.edu.inheritance;

public class SportsCar extends Vehicle {
	
	private boolean isTurvo;
	
	public SportsCar(String model, String engineSound) {
		super(model, engineSound);
	}
	
	public SportsCar(String model) {
		super(model, "부아앙!");
	}
	
	
//	vehicle에 engineSound 선언으로 필요없어짐
//	@Override
//	public void startMoter() {
//		super.startMoter();
//		System.out.println("부앙!");
//		
//	}
	
	public void  setTurvoMode() {
		if(!this.isTurvo) {
			this.isTurvo = true;
			System.out.println("터보모드");
		}else {
			this.isTurvo = false;
			System.out.println("일반모드");
		}
	}

}
