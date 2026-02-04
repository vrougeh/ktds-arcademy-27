package com.ktdsuniversity.edu.inheritance;

public class Zoo {
	public static void main(String[] args) {
		
		String a = "a";
		String aa = "a";
		System.out.println(a == aa); // equals()로 들어감 메모리의 주소를 비교하기 때문에 true
		
		
//		Bird duck = new Bird("오리","꽥",15f,20f,50f);
		Animal duck = new Bird("오리","꽥",15f,20f,50f); //선언 가능 많이 씀
		Animal duck2 = new Bird("오리","꽥",15f,20f,50f); 
//		Bird duck = new Animal("오리","꽥",15f,20f,50f); //불가능?
		duck.howling();
		duck.move();
		System.out.println(duck.toString());
		System.out.println("== 비교 : \t" + (duck == duck2)); // 메모리의 주소를 비교하기 때문에 false
		System.out.println("equals 비교 : \t" + duck.equals(duck2)); 
		// 메모리의 주소를 비교하기 때문에 false 지만 Animal 에서 override를 통해 true 가 나옴
		
		
		
		
		//명시적형변환 옛날버전
//		if(duck instanceof Bird) {
//			Bird bird = (Bird) duck;
//			bird.fly();
//			bird.move();
//			bird.land();
//			bird.move();
//		}
		//필요시에만 형변환하여 사용한다 - 확장성때문
		//명시적형변환 요즘버전 - 바로 형변환해서 넣기
		if(duck instanceof Bird bird) {
			bird.fly();
			bird.move();
			bird.land();
			bird.move();
			System.out.println(bird.toString());
		}
		
//		duck.fly();
//		duck.move();
//		duck.land();
//		duck.move();
		
		Animal lion = new Animal("사자","크아앙",80f,60f,200f);
		Animal tiger = new Animal("호랑이","어흥",50f,55f,200f);
		
		if(duck instanceof Bird bird) {
			bird.fly();
			bird.move();
		}
		tiger.attack(duck);
		duck.attack(tiger);
		
		lion.howling();
		tiger.howling();
		
		lion.move();
		tiger.move();
		
		tiger.attack(lion);
		lion.attack(tiger);
		lion.attack(tiger);
		lion.attack(tiger);
		lion.attack(tiger);
		tiger.attack(lion);
		
		
		
	}

}
