package com.ktdsuniversit.edu.inheritance;

public class Animal {
	private String name;
	private String voice;
	private float speed;
	private float damage;
	private float hitPoint;
	
	
	//public Animal() {}
	
	public Animal(String name, String voice,float speed, float damage, float hitPoint) {
		this.name = name;
		this.voice = voice;
		this.speed = speed;
		this.damage = damage;
		this.hitPoint = hitPoint;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	
	public void howling() {
		System.out.println(this.name + " : " + this.voice);
	}
	
	public void move() {
		System.out.println(this.name +" : " +this.speed + "km/h 의 속도로 움직임.");
	}
	
	public void attack(Animal other) {
		
		if(this.isDead()) {
			System.out.println(this.name + "이/가 이미 죽어서 행동할 수 없습니다.");
			return;
		}
		
		if( !(this instanceof Bird) && other instanceof Bird bird) {
			if(bird.getIsFly()) {
				System.out.println(other.getName() + "이/가 날고 있어서 공격할 수 없습니다.");
				return;
			}
		}
		
		System.out.println(this.name + "이/가 " + other.getName() + "에게 공격하려합니다.");
		if(!other.isDead()) {
			other.getDamage(this.damage);
		}else {
			System.out.println(other.getName() + "이/가 이미 죽어있습니다.");
		}
	}
	
	
	
	public void getDamage(float damage) {
		System.out.println(this.name +"이/가 " + damage + "만큼 피해를 입었습니다.");
		this.hitPoint -= damage;
	}
	
	public boolean isDead() {
		return this.hitPoint <= 0;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Animal other) {
			return other.getName().equals(this.name); //이름이 같으면 return true
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", voice=" + voice + ", speed=" + speed + ", damage=" + damage + ", hitPoint="
				+ hitPoint + "]";
	}
	
	

}
