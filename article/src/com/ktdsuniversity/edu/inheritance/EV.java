package com.ktdsuniversity.edu.inheritance;

public class EV extends Vehicle{
	private float bettery;

	public EV(String model, float bettery) {
		super(model,"(조용한소리)");
		this.bettery = bettery;
	}

	//이런 방법을 사용을 하는 것 보다 변수 추가가 좋음
//	@Override
//	public void startMoter() {
//		super.startMoter();
//		System.out.println("(조용한소리)");
//		
//	}
	
	
	public float getBettery() {
		return this.bettery;
	}
	
	public void printBettery() {
		System.out.println(this.getModel() );
	}

}
