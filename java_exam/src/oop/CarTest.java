package oop;

public class CarTest {
	
	public static void main(String[] args) {
		
		Car kona = new Car(); // 기본값 할당됨
		System.out.println(kona);
		kona.pressEngineStartButton();
		kona.pressGasolinPedal(90);
		
		// kona의 엔진 상태 출력
		boolean konaEngineState = kona.isEngineStart;
		System.out.println("kona engine state : " + konaEngineState);
		
		// kona의 현재 속도 출력
		int konaSpeed = kona.speed;
		System.out.println("kona speed : " + konaSpeed);
		
		
		Car carnival = new Car();
		System.out.println(carnival);
		
		carnival.pressGasolinPedal(60);
		carnival.pressEngineStartButton();
		carnival.pressBrakePedal(10);
		carnival.pressBrakePedal(10);
		
		// carnival의 엔진 상태 출력
		boolean carnivalEngineState = carnival.isEngineStart;
		System.out.println("carnival engine state : " + carnivalEngineState);
		
		// carnival의 현재 속도 출력
		int carnivalSpeed = carnival.speed;
		System.out.println("carnival speed : " + carnivalSpeed);
		
		
		
		
	}

}
