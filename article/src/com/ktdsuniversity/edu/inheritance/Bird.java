package com.ktdsuniversity.edu.inheritance;

public class Bird extends Animal{
	
	private boolean isFly;
	private float workingSpeed;

	
	public Bird(String name, String voice, float speed, float damage, float hitPoint) {
		super(name, voice, speed, damage, hitPoint);
		this.workingSpeed = speed;
	}
	
	public void fly() {
		this.isFly = true;
		super.setSpeed(70f);
//		this.setSpeed(70f); //동일 작동?
	}
	
	public void land() {
		this.isFly = false;
		super.setSpeed(this.workingSpeed);
	}
	
	public boolean getIsFly() {
		return this.isFly;
	}
	
	
	//Bird 클래스의 최종 SuperClass 인 object 클래스의 toString() 메소드를 다시 정의한다
	
	@Override
	public String toString() {
		String str = "Bird [name : %s,isFly : %s]";
		return str.formatted(super.getName(),this.isFly);
	}


}
