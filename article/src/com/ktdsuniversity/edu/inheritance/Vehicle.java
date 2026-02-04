package com.ktdsuniversity.edu.inheritance;

public class Vehicle {
	private String model;
	private boolean isOn;
	private String engineSound;
	
	public Vehicle(String model) {
		this.model = model;
		this.engineSound = "부웅";
	}
	
	public Vehicle(String model, String engineSound) {
		this.model = model;
		this.engineSound = engineSound;
	}
	
	
	public void startMoter() {
		if(!this.isOn) {
			this.isOn = true;
			System.out.println(this.model+"의 시동이 켜졌습니다.");
			System.out.println(this.engineSound);
		}else {
			this.isOn = false;
			System.out.println(this.model+"의 시동을 껐습니다.");
		}
	}
	
	public String getModel() {
		return this.model;
	}
	
	public boolean getIsOn() {
		return this.isOn;
	}

}
