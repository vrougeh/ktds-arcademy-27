package com.ktdsuniversit.edu.inheritance;

public class BatMobile extends SportsCar{
	private boolean isDetachBatpod;
	
	public BatMobile(String model) {
		super(model,"부아아아앙!!!!!!");
	}
	
	public void setBatpod() {
		this.isDetachBatpod = !this.isDetachBatpod;
		if(this.isDetachBatpod) {
			System.out.println("Batpod 분리");
		}else {
			System.out.println("Batpod 결합");
		}
	}

}
